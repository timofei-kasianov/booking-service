package com.chisw.timofei.booking.accommodation.controller.dto;

import lombok.*;

/**
 * @author timofei.kasianov 10/3/18
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AddressViewDTO {

    private String country;
    private String city;
    private String line1;
    private String line2;

}
