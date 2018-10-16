package com.chisw.timofei.booking.reservation.data.entity.embeddable;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author timofei.kasianov 10/2/18
 */
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Embeddable
public class Guest {

    @Column(name = "guest_full_name", nullable = false)
    private String fullName;

    @Column(name = "guest_phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "guest_email", nullable = false)
    private String email;

}
