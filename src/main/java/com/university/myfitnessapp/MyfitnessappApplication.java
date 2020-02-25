package com.university.myfitnessapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(basePackages = "com.university.myfitnessapp.repository.models")
@EnableJpaRepositories(basePackages = "com.university.myfitnessapp.repository")
public class MyfitnessappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfitnessappApplication.class, args);
    }

}
