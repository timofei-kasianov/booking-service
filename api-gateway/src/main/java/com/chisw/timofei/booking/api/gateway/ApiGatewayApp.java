package com.chisw.timofei.booking.api.gateway;

import com.chisw.timofei.booking.api.gateway.config.ApiGatewaySpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author timofei.kasianov 10/11/18
 */
@SpringBootApplication
@Import(ApiGatewaySpringConfig.class)
public class ApiGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApp.class, args);
    }
}
