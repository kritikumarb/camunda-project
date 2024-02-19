package com.camunda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/camunda")
public class WelcomeMessage {

    @GetMapping("/say-hello")
    private String welcome(){
        return  "Hello World";
    }
}
