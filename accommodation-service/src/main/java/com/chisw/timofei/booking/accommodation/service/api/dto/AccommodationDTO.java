package com.chisw.timofei.booking.accommodation.service.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author timofei.kasianov 10/2/18
 */
@RequiredArgsConstructor
@Getter
@Builder
public class AccommodationDTO {

    private final String id;
    private final long ratePerNightInCents;
    private final String description;
    private final String hostId;

}
