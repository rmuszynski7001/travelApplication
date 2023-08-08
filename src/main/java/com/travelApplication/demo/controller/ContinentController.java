package com.travelApplication.demo.controller;

import com.travelApplication.demo.service.ContinentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/continent")
public class ContinentController {

    private final Logger logger = LoggerFactory.getLogger(ContinentController.class);


    @Autowired
    private final ContinentService continentService;

    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }

/*
    @GetMapping("/api/continent")
    public ModelAndView getAllContinents(){
        ModelAndView mav = new ModelAndView("continent");
        mav.addObject("continents",continentService.getContinents());
        return mav;
    }
*/


    @GetMapping
    public String continentMenu(){
        return "continent";
    }
/*
    @GetMapping
    public List<Continent> getContinents(){
        return continentService.getContinents();
    }

    @PostMapping
    public Continent createContinent(@RequestBody Continent continent){
        return continentService.saveContinent(continent);
    }

*/
}
