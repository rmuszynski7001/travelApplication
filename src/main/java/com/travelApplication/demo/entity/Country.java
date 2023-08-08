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
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="country_id")
    private Long id;

    @Column(name="country_name")
    private String countryName;
/*
    @Column(name="continent_id")
    private Long continentId;

 */

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="continent_id") // referencedColumnName = "continent_id")
    private Continent continent;

    @JsonIgnore
    @OneToMany(mappedBy = "country",
            cascade = CascadeType.ALL
    )
    private Set<City> cities = new HashSet<>();

    public Country(String countryName, Continent continent) {
        this.countryName = countryName;
        this.continent = continent;
    }

    public Country() {
    }
}
