package com.travelApplication.demo.service;

import com.travelApplication.demo.entity.Continent;
import com.travelApplication.demo.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {

    @Autowired
    private final ContinentRepository continentRepository;

    public ContinentService(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    public List<Continent> getContinents() {
        return continentRepository.findAll();
    }

    public Continent saveContinent(Continent continent){
        return continentRepository.save(continent);
    }
}
