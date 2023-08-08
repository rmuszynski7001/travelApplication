package com.travelApplication.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    private final Logger logger = LoggerFactory.getLogger(MainPageController.class);
    @GetMapping("/main")
    public String mainMenu() {
        return "main";
    }
}
