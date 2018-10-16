package com.chisw.timofei.booking.api.gateway.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

/**
 * @author timofei.kasianov 10/11/18
 */
@Configuration
@EnableZuulProxy
@EnableEurekaClient
@EnableHystrix
public class ApiGatewaySpringConfig {
}
