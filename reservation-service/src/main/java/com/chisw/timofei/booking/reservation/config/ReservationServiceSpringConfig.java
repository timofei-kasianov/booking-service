package com.chisw.timofei.booking.reservation.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author timofei.kasianov 10/2/18
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.chisw.timofei.booking.reservation.data.repository")
@EnableHystrix
@EnableEurekaClient
public class ReservationServiceSpringConfig {

}
