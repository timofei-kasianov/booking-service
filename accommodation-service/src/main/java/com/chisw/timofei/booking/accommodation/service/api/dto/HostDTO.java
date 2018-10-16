package com.chisw.timofei.booking.accommodation.service.api.dto;

import lombok.*;

/**
 * @author timofei.kasianov 10/2/18
 */
@RequiredArgsConstructor
@Getter
@Builder
public class HostDTO {

    private final String id;
    private final String title;
    private final String description;
    private final AddressDTO address;

}
