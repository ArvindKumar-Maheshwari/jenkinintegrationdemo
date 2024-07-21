package com.example.jenkinintegrationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinintegrationdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinintegrationdemoApplication.class, args);
        hello();
    }

    @GetMapping
    public static String hello() {
        return "Sample application keep mind";
    }

}



