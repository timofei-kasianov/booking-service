package com.chisw.timofei.booking.accommodation.controller.dto;

import lombok.*;

/**
 * @author timofei.kasianov 10/2/18
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccommodationViewDTO {

    private String id;
    private long ratePerNightInCents;
    private String description;
    private String hostId;

}
