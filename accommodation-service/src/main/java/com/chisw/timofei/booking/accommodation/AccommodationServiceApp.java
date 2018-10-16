package com.chisw.timofei.booking.accommodation;

import com.chisw.timofei.booking.accommodation.config.AccommodationServiceSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author timofei.kasianov 10/3/18
 */
@SpringBootApplication
@Import(AccommodationServiceSpringConfig.class)
public class AccommodationServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(AccommodationServiceApp.class, args);
    }
}
