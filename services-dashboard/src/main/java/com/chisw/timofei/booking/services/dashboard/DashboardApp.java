package com.chisw.timofei.booking.services.dashboard;

import com.chisw.timofei.booking.services.dashboard.config.DashboardAppSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author timofei.kasianov 10/10/18
 */
@SpringBootApplication
@Import(DashboardAppSpringConfig.class)
public class DashboardApp {
    public static void main(String[] args) {
        SpringApplication.run(DashboardApp.class, args);
    }
}
