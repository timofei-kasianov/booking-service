package com.chisw.timofei.booking.geo.location.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author timofei.kasianov 10/3/18
 */
@Configuration
@EnableEurekaClient
@EnableHystrix
@EnableJpaRepositories(basePackages = "com.chisw.timofei.booking.geo.location.data.repository")
public class GeoLocationServiceSpringConfig {
}
