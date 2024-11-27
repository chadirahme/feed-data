package com.tacticals.feeddata.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        System.out.println("health - STARTED!!! ");
        return ResponseEntity.ok("UP!!");
    }
}
