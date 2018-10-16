package com.chisw.timofei.booking.config.server.config;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author timofei.kasianov 10/12/18
 */
@Configuration
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerSpringConfig {
}
