package com.travelApplication.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.travelApplication.demo.enums.ContinentName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="continent_id")
    private Long continentId;

    @Column(name="continent_name")
    private String continentName;

    @JsonIgnore
    @OneToMany(mappedBy = "continent",
            cascade = CascadeType.ALL
    )
    private Set<Country> countries = new HashSet<>();

    public Continent(Long id, String continentName) {
        this.continentId = id;
        this.continentName = continentName;
    }

    public Continent(ContinentName String) {
        this.continentName = continentName;
    }

    public Continent() {
    }
}
