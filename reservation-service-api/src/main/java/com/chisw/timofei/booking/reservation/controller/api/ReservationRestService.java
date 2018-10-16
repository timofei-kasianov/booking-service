package com.chisw.timofei.booking.reservation.controller.api;

import com.chisw.timofei.booking.reservation.controller.api.dto.ReservationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author timofei.kasianov 10/9/18
 */
@RequestMapping("/reservations")
public interface ReservationRestService {
    @GetMapping("/")
    ResponseEntity<List<ReservationDTO>> list();

    @GetMapping("/accommodations/{id}")
    ResponseEntity<List<ReservationDTO>> listByAccommodationId(@PathVariable("id") String accommodationId);

    @GetMapping("/{id}")
    ResponseEntity<ReservationDTO> get(@PathVariable("id") long reservationId);

    @PostMapping("/")
    ResponseEntity<Long> create(@RequestBody ReservationDTO createRequest);

    @PutMapping("/{id}")
    ResponseEntity<Void> update(@PathVariable("id") long reservationId, @RequestBody ReservationDTO updateRequest);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") long reservationId);
}
