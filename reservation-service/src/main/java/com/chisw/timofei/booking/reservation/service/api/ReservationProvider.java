package com.chisw.timofei.booking.reservation.service.api;

import com.chisw.timofei.booking.reservation.service.api.dto.ReservationDTO;

import java.util.List;

/**
 * @author timofei.kasianov 10/2/18
 */
public interface ReservationProvider {

    List<ReservationDTO> readAll();

    List<ReservationDTO> readByAccommodationId(String accommodationId);

    List<ReservationDTO> readByGuestEmail(String guestEmail);

    ReservationDTO readById(long reservationId);

}
