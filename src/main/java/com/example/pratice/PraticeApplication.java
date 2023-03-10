package com.example.pratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PraticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraticeApplication.class, args);
    }

}
