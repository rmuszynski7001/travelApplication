package com.travelApplication.demo.service;

import com.travelApplication.demo.entity.Hotel;
import com.travelApplication.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private final HotelRepository hotelRepository;


    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> getHotels() { return hotelRepository.findAll();}

    public Hotel saveHotel(Hotel hotel) { return hotelRepository.save(hotel);}
}
