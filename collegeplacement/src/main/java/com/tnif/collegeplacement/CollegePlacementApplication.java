package com.tnif.collegeplacement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CollegePlacementApplication {
    public static void main(String[] args) {
        SpringApplication.run(CollegePlacementApplication.class, args);
    }

    @Bean
    public CommandLineRunner testContext(ApplicationContext ctx) {
        return args -> {
            System.out.println("== LOADED CONTROLLERS ==");
            String[] beans = ctx.getBeanNamesForAnnotation(RestController.class);
            for (String name : beans) {
                System.out.println("👉 " + name);
            }
        };
    }
}
