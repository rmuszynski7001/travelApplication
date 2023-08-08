package com.travelApplication.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hotel_id")
    private Long id;

    @Column(name="hotel_name")
    private String hotelName;

    @Column(name="hotel_standard")
    private int hotelStandard;

    @Column(name="hotel_info")
    private String hotelInfo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="city_id")
    private City city;

    public Hotel() {
    }
}
