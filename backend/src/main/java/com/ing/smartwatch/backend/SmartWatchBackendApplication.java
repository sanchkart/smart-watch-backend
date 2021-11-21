package com.ing.smartwatch.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@RefreshScope
@EnableEurekaClient
public class SmartWatchBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartWatchBackendApplication.class, args);
    }
}
