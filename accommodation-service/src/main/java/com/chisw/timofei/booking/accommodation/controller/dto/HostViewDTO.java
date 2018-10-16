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
public class HostViewDTO {

    private String id;
    private String title;
    private String description;
    private AddressViewDTO address;

}
