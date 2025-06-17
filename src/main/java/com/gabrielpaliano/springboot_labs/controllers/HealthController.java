package com.gabrielpaliano.springboot_labs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

//GetMapping define o endpoint
    @GetMapping("/health")
    public String healthCheck() {
        return "API online";
    }
}
