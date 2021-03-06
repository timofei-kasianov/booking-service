package com.chisw.timofei.booking.accommodation.controller.dto.search;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author timofei.kasianov 10/2/18
 */
@RequiredArgsConstructor
@Getter
@Builder
public class HostSearchRequest {

    private final String title;
    private final String description;
    private final String country;
    private final String city;
    private final String addressLine1;
    private final String addressLine2;

}
