package com.polixis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("spring.datasource.username", args[0]);
        properties.setProperty("spring.datasource.password", args[1]);

        SpringApplication app = new SpringApplication(ConsumerApplication.class);
        app.setDefaultProperties(properties);
        app.run(args);
    }

}
