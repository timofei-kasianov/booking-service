package com.chisw.timofei.booking.service.registry;

import com.chisw.timofei.booking.service.registry.config.ServiceRegistrySpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author timofei.kasianov 10/3/18
 */
@SpringBootApplication
@Import(ServiceRegistrySpringConfig.class)
public class ServiceRegistryApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApp.class, args);
    }
}
