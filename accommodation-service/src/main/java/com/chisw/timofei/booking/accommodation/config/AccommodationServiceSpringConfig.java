package com.chisw.timofei.booking.accommodation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author timofei.kasianov 10/3/18
 */
@Configuration
@Import({ServiceRegistryClientConfig.class, RibbonConfig.class, FeignConfig.class, HystrixConfig.class})
@EnableMongoRepositories(basePackages = "com.chisw.timofei.booking.accommodation.data.repository")
public class AccommodationServiceSpringConfig {

}
