package com.travelApplication.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table
public class  City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="city_id")
    private Long id;

    @Column(name="city_name")
    private String cityName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="country_id")
    private Country country;

    @JsonIgnore
    @OneToMany(mappedBy = "city",
            cascade = CascadeType.ALL
    )
    private Set<Hotel> hotels = new HashSet<>();



    public City() {
    }
}
