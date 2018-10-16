package com.chisw.timofei.booking.accommodation.controller;

import com.chisw.timofei.booking.accommodation.controller.dto.HostViewDTO;
import com.chisw.timofei.booking.accommodation.controller.dto.search.HostSearchRequest;
import com.chisw.timofei.booking.accommodation.service.api.write.HostsManagement;
import com.chisw.timofei.booking.accommodation.service.api.read.HostsProvider;
import com.chisw.timofei.booking.accommodation.service.api.dto.HostDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.chisw.timofei.booking.accommodation.controller.dto.Transformer.toHostDto;
import static com.chisw.timofei.booking.accommodation.controller.dto.Transformer.toHostViewDto;
import static com.chisw.timofei.booking.accommodation.controller.dto.Transformer.toHostViewDtoList;

/**
 * @author timofei.kasianov 10/2/18
 */
@RestController
@Slf4j
@RequestMapping("/accommodations/hosts/")
public class HostsRestService {

    private final HostsProvider hostsProvider;
    private final HostsManagement hostsManagement;

    @Inject
    public HostsRestService(HostsProvider hostsProvider, HostsManagement hostsManagement) {
        this.hostsProvider = hostsProvider;
        this.hostsManagement = hostsManagement;
    }

    @GetMapping("/")
    public ResponseEntity<List<HostViewDTO>> list(@RequestParam(value = "ids", required = false) String[] ids) {
        log.info("list");
        final List<HostDTO> hosts = ids != null ?
                hostsProvider.readByIds(Arrays.asList(ids)) :
                hostsProvider.readAll();
        return ResponseEntity.ok().body(toHostViewDtoList(hosts));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HostViewDTO> get(@PathVariable("id") String hostId) {
        log.info("get");
        final HostDTO host = hostsProvider.readById(hostId);
        return ResponseEntity.ok().body(toHostViewDto(host));
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody HostViewDTO hostCreateRequest) {
        log.info("create");
        final String hostId = hostsManagement.create(toHostDto(hostCreateRequest));
        return ResponseEntity.ok().body(hostId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") String hostId, @RequestBody HostViewDTO hostData) {
        log.info("update");
        hostsManagement.update(hostId, toHostDto(hostData));
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String hostId) {
        log.info("delete");
        hostsManagement.delete(hostId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<HostViewDTO>> search(HostSearchRequest searchRequest) {
        log.info("search");
        return ResponseEntity.ok().body(new ArrayList<>());
    }

}
