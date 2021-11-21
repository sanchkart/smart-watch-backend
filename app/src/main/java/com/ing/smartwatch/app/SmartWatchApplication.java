package com.ing.smartwatch.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@RefreshScope
@EnableBinding(Source.class)
public class SmartWatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartWatchApplication.class, args);
    }
}
