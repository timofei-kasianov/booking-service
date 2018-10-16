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
public class GuestDTO {

    private final String fullName;
    private final String email;
    private final String phoneNumber;

}
