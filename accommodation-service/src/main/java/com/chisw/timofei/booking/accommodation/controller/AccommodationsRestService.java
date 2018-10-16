package com.chisw.timofei.booking.accommodation.controller;

import com.chisw.timofei.booking.accommodation.controller.dto.AccommodationViewDTO;
import com.chisw.timofei.booking.accommodation.controller.dto.search.AccommodationSearchRequest;
import com.chisw.timofei.booking.accommodation.service.api.read.AccommodationsProvider;
import com.chisw.timofei.booking.accommodation.service.api.dto.AccommodationDTO;
import com.chisw.timofei.booking.accommodation.service.api.write.AccommodationsManagement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import static com.chisw.timofei.booking.accommodation.controller.dto.Transformer.*;

/**
 * @author timofei.kasianov 10/2/18
 */
@RestController
@Slf4j
@RequestMapping("/accommodations/")
public class AccommodationsRestService {

    private final AccommodationsProvider accommodationsProvider;
    private final AccommodationsManagement accommodationsManagement;

    @Inject
    public AccommodationsRestService(AccommodationsProvider accommodationsProvider,
                                     AccommodationsManagement accommodationsManagement) {
        this.accommodationsProvider = accommodationsProvider;
        this.accommodationsManagement = accommodationsManagement;
    }

    @GetMapping("/")
    public ResponseEntity<List<AccommodationViewDTO>> list(@RequestParam(value = "ids", required = false) String[] ids) {
        log.info("list");
        final List<AccommodationDTO> hosts = ids != null ?
                accommodationsProvider.readByIds(Arrays.asList(ids)) :
                accommodationsProvider.readAll();
        return ResponseEntity.ok().body(toAccommodationViewDtoList(hosts));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccommodationViewDTO> get(@PathVariable("id") String accommodationId) {
        log.info("get");
        final AccommodationDTO accommodation = accommodationsProvider.readById(accommodationId);
        return ResponseEntity.ok().body(toAccommodationViewDto(accommodation));
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody AccommodationViewDTO accommodationData) {
        log.info("create");
        final String accommodationId = accommodationsManagement.create(toAccommodationDto(accommodationData));
        return ResponseEntity.ok().body(accommodationId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") String accommodationId, @RequestBody AccommodationViewDTO accommodationData) {
        log.info("update");
        accommodationsManagement.update(accommodationId, toAccommodationDto(accommodationData));
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String accommodationId) {
        log.info("delete");
        accommodationsManagement.delete(accommodationId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<AccommodationViewDTO>> search(AccommodationSearchRequest searchRequest, Principal principal) {
        log.info("search");
        final List<AccommodationDTO> result = accommodationsProvider.search(toAccommodationSearchRequestDto(searchRequest));
        return ResponseEntity.ok().body(toAccommodationViewDtoList(result));
    }

    @ExceptionHandler(Exception.class)
    public void commonExceptionHandler(HttpServletResponse response, Exception ex) throws IOException {
        log.warn("An exception occurred", ex);
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, ex.getMessage());
    }

}
