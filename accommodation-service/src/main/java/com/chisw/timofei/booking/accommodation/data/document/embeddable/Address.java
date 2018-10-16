package com.chisw.timofei.booking.accommodation.data.document.embeddable;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * @author timofei.kasianov 10/2/18
 */
@RequiredArgsConstructor
@Getter
@Builder
public class Address {

    private final String country;
    private final String city;
    private final String line1;
    private final String line2;

}
