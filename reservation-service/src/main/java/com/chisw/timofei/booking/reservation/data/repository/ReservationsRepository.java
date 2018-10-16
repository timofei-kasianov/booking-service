package com.chisw.timofei.booking.reservation.data.repository;

import com.chisw.timofei.booking.reservation.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author timofei.kasianov 10/2/18
 */
@Repository
public interface ReservationsRepository extends CrudRepository<Reservation, Long> {
}
