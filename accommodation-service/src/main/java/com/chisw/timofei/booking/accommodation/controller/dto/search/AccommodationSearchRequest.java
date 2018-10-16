package com.chisw.timofei.booking.accommodation.controller.dto.search;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author timofei.kasianov 10/2/18
 */
@RequiredArgsConstructor
@Getter
@Builder
public class AccommodationSearchRequest {

    private final List<String> hostIds;
    private final Long availableFromTimestamp;
    private final Long availableToTimestamp;
    private final Long minRateInCents;
    private final Long maxRateInCents;
    private final String description;

}
