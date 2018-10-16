package com.chisw.timofei.booking.reservation.service.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author timofei.kasianov 10/3/18
 */
@RequiredArgsConstructor
@Getter
@Builder
public class ReservationDTO {

    private final Long id;
    private final long checkInTimestamp;
    private final long checkOutTimestamp;
    private final long priceInCents;
    private final GuestDTO guest;

}
