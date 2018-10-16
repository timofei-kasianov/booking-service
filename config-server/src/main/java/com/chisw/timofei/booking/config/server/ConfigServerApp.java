package com.chisw.timofei.booking.config.server;

import com.chisw.timofei.booking.config.server.config.ConfigServerSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author timofei.kasianov 10/12/18
 */
@SpringBootApplication
@Import(ConfigServerSpringConfig.class)
public class ConfigServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
