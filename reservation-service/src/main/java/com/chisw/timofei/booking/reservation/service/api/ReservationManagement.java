package com.chisw.timofei.booking.reservation.service.api;

import com.chisw.timofei.booking.reservation.service.api.dto.ReservationDTO;

/**
 * @author timofei.kasianov 10/2/18
 */
public interface ReservationManagement {

    long create(ReservationDTO reservation);

    void update(long reservationId, ReservationDTO reservation);

    void delete(long reservationId);

}
