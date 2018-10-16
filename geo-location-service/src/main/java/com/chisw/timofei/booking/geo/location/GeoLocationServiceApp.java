package com.chisw.timofei.booking.geo.location;

import com.chisw.timofei.booking.geo.location.config.GeoLocationServiceSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author timofei.kasianov 10/3/18
 */
@SpringBootApplication
@Import(GeoLocationServiceSpringConfig.class)
public class GeoLocationServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(GeoLocationServiceApp.class, args);
    }
}
