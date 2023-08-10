package com.travelApplication.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
/*
    @Column(name="continent_id")
    private Long continentId;

 */

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="continent_id")
    private Continent continent;

    @JsonIgnore
    @OneToMany(mappedBy = "country",
            cascade = CascadeType.ALL
    )
    private Set<City> cities = new HashSet<>();

    public Country(String name, Continent continent, Set<City> cities) {
        this.name = name;
        this.continent = continent;
        this.cities = cities;
    }
}
