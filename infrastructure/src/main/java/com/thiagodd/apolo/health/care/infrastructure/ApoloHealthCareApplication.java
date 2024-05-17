package com.thiagodd.apolo.health.care.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
@ComponentScan("com.thiagodd.apolo.health.care")
public class ApoloHealthCareApplication {
    public static void main(String[] args) {
        System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "development");

        SpringApplication.run(ApoloHealthCareApplication.class, args);
    }
}