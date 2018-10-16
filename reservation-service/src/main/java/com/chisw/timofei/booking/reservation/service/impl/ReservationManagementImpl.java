package com.chisw.timofei.booking.reservation.service.impl;

import com.chisw.timofei.booking.reservation.data.repository.ReservationsRepository;
import com.chisw.timofei.booking.reservation.service.api.ReservationManagement;
import com.chisw.timofei.booking.reservation.service.api.dto.ReservationDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @author timofei.kasianov 10/2/18
 */
@Service
@Transactional
public class ReservationManagementImpl implements ReservationManagement {

    private final ReservationsRepository reservationsRepository;

    @Inject
    public ReservationManagementImpl(ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    @Override
    public long create(ReservationDTO reservation) {
        return 0;
    }

    @Override
    public void update(long reservationId, ReservationDTO reservation) {

    }

    @Override
    public void delete(long reservationId) {

    }
}
