package com.chisw.timofei.booking.reservation.controller.api.dto;

import com.chisw.timofei.booking.reservation.controller.api.dto.GuestDTO;
import lombok.*;

/**
 * @author timofei.kasianov 10/3/18
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ReservationDTO {

    private Long id;
    private long checkInTimestamp;
    private long checkOutTimestamp;
    private String accommodationId;
    private long priceInCents;
    private GuestDTO guest;

}
