package com.chisw.timofei.booking.reservation.controller;

import com.chisw.timofei.booking.reservation.controller.api.ReservationRestService;
import com.chisw.timofei.booking.reservation.controller.api.dto.GuestDTO;
import com.chisw.timofei.booking.reservation.controller.api.dto.ReservationDTO;
import com.chisw.timofei.booking.reservation.service.api.ReservationManagement;
import com.chisw.timofei.booking.reservation.service.api.ReservationProvider;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * @author timofei.kasianov 10/2/18
 */
@Slf4j
@RestController
public class ReservationRestServiceImpl implements ReservationRestService {

    private final ReservationProvider reservationProvider;
    private final ReservationManagement reservationManagement;

    @Inject
    public ReservationRestServiceImpl(ReservationProvider reservationProvider, ReservationManagement reservationManagement) {
        this.reservationProvider = reservationProvider;
        this.reservationManagement = reservationManagement;
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<ReservationDTO>> list() {
        log.info("list");
        final List<ReservationDTO> mockResponse = Lists.newArrayList(
                new ReservationDTO(1L, 1L, 1L, "accommodation-id", 1L, new GuestDTO("", "", ""))
        );
        return ResponseEntity.ok().body(mockResponse);
    }

    @Override
    @GetMapping("/accommodations/{id}")
    public ResponseEntity<List<ReservationDTO>> listByAccommodationId(@PathVariable("id") String accommodationId) {
        log.info("listByAccommodationId");
        final List<ReservationDTO> mockResponse = Lists.newArrayList(
                new ReservationDTO(1L, 1L, 1L, accommodationId, 1L, new GuestDTO("", "", ""))
        );
        return ResponseEntity.ok().body(mockResponse);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ReservationDTO> get(@PathVariable("id") long reservationId) {
        log.info("get");
        return ResponseEntity.ok().body(new ReservationDTO(
                1L,
                1L,
                1L,
                "acc_id",
                1L,
                new GuestDTO("", "", ""))
        );
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Long> create(@RequestBody ReservationDTO createRequest) {
        log.info("create");
        return ResponseEntity.ok().body(1L);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") long reservationId, @RequestBody ReservationDTO updateRequest) {
        log.info("update");
        return ResponseEntity.ok().build();
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long reservationId) {
        log.info("delete");
        return ResponseEntity.ok().build();
    }


}
