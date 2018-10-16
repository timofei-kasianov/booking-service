package com.chisw.timofei.booking.accommodation.config;

import feign.Logger;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author timofei.kasianov 10/5/18
 */
@Configuration
@EnableFeignClients(
        basePackages = "com.chisw.timofei.booking.accommodation.integration",
        defaultConfiguration = FeignConfig.FeignClientsConfiguration.class
)
public class FeignConfig {

    public static class FeignClientsConfiguration {

        @Bean
        @LoadBalanced
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }

        @Bean
        public Logger.Level feignLoggerLevel() {
            return Logger.Level.FULL;
        }

    }

}
