package com.dylan.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GZipApplication {
    public static void main(String[] args) {
        SpringApplication.run(GZipApplication.class, args);
    }
}
