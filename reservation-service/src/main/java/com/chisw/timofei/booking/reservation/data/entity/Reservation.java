package com.chisw.timofei.booking.reservation.data.entity;

import com.chisw.timofei.booking.reservation.data.entity.embeddable.Guest;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author timofei.kasianov 10/2/18
 */
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "check_in", nullable = false)
    private Date checkIn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "check_out", nullable = false)
    private Date checkOut;

    @Column(name = "ext_accommodation_id", nullable = false)
    private String accommodationId;

    @Basic(optional = false)
    private long priceInCents;

    @Embedded
    private Guest guest;


}
