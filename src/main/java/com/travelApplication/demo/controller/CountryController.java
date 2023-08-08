package com.travelApplication.demo.controller;


import com.travelApplication.demo.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("api/country")
public class CountryController {

    private final Logger logger = LoggerFactory.getLogger(CountryController.class);

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    //main menu
    @GetMapping
    public String mainMenu(Model model) {
        model.addAttribute("name", "Countries page");
        return "main_country";
    }

    @GetMapping("/add")
    public String add() {
        return "new_country";
    }
}
