package com.chisw.timofei.booking.reservation.controller.api.dto;

import lombok.*;

/**
 * @author timofei.kasianov 10/3/18
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class GuestDTO {

    private String fullName;
    private String email;
    private String phoneNumber;

}
