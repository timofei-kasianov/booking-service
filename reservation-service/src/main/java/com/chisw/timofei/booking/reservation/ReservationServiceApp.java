package com.chisw.timofei.booking.reservation;

import com.chisw.timofei.booking.reservation.config.ReservationServiceSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author timofei.kasianov 10/2/18
 */
@SpringBootApplication
@Import(ReservationServiceSpringConfig.class)
public class ReservationServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ReservationServiceApp.class, args);
    }
}
