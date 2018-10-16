package com.chisw.timofei.booking.services.dashboard.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

/**
 * @author timofei.kasianov 10/10/18
 */
@Configuration
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
public class DashboardAppSpringConfig {
}
