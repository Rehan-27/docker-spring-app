package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello from Dockerized Spring Boot App! This app is developed by Rehan Khan and containerized using Docker and deployed on Render.";
    }
}
