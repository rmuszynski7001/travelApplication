package com.travelApplication.demo.service;

import com.travelApplication.demo.entity.Country;
import com.travelApplication.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountries(){ return countryRepository.findAll();}

    public Country saveCountry(Country country) { return countryRepository.save(country);}

}
