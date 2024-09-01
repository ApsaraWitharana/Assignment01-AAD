package com.example.test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication

public class Test01Application {
    public static void main(String[] args) {
        SpringApplication.run(Test01Application.class, args);
        System.out.println("hiii");
    }

}
