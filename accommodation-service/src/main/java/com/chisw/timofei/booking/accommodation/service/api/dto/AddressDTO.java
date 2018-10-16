package com.chisw.timofei.booking.accommodation.service.api.dto;

import lombok.*;

/**
 * @author timofei.kasianov 10/2/18
 */
@RequiredArgsConstructor
@Getter
@Builder
public class AddressDTO {

    private final String country;
    private final String city;
    private final String line1;
    private final String line2;

}
