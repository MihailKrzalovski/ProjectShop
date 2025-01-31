package com.example.projectshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectShopApplication.class, args);
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    }

}
