package com.travelApplication.demo.continent;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Continent {

    @Id
    @GeneratedValue
    @Column(name="continent_id")
    private Long id;

    @Column(name="continent_name")
    private String continentName;

    public Continent(Long id, String continentName) {
        this.id = id;
        this.continentName = continentName;
    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public Continent() {
    }
}
