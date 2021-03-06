package com.se7so;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class RestMicroService {

    /**
     * Spring boot start up of the REST service
     * @param args
     */
    public static void main(final String[] args) {
        SpringApplication.run(RestMicroService.class, args);
    }
}
