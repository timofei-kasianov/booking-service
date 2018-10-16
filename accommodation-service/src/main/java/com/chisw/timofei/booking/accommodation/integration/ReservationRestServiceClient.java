package com.chisw.timofei.booking.accommodation.integration;

import com.chisw.timofei.booking.reservation.controller.api.ReservationRestService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author timofei.kasianov 10/9/18
 */
@FeignClient(value = "reservation-service")
public interface ReservationRestServiceClient extends ReservationRestService {

}
