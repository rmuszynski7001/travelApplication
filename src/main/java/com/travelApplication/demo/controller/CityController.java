package com.travelApplication.demo.controller;

import com.travelApplication.demo.entity.City;
import com.travelApplication.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/city")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<City> getCities() {
        return cityService.getCities();

    }

    /*
    @PostMapping
    public City createCity(@RequestBody City city){
        return cityService.saveCity(city);
    }
    */

    @PostMapping
    public ResponseEntity<City> createCity(@RequestBody City city) {
        City savedCity = cityService.saveCity(city);


        return ResponseEntity.ok().body(savedCity);
    }
}
