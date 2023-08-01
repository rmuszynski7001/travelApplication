package com.travelApplication.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
