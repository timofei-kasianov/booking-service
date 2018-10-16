package com.chisw.timofei.booking.reservation.service.impl;

import com.chisw.timofei.booking.reservation.data.repository.ReservationsRepository;
import com.chisw.timofei.booking.reservation.service.api.ReservationProvider;
import com.chisw.timofei.booking.reservation.service.api.dto.ReservationDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * @author timofei.kasianov 10/2/18
 */
@Service
@Transactional(readOnly = true)
public class ReservationProviderImpl implements ReservationProvider {

    private final ReservationsRepository reservationsRepository;

    @Inject
    public ReservationProviderImpl(ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    @Override
    public List<ReservationDTO> readAll() {
        return null;
    }

    @Override
    public List<ReservationDTO> readByAccommodationId(String accommodationId) {
        return null;
    }

    @Override
    public List<ReservationDTO> readByGuestEmail(String guestEmail) {
        return null;
    }

    @Override
    public ReservationDTO readById(long reservationId) {
        return null;
    }
}
