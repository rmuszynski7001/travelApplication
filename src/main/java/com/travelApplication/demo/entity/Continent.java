package com.travelApplication.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.travelApplication.demo.enums.ContinentName;
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
@AllArgsConstructor
@NoArgsConstructor
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "continent",
            cascade = CascadeType.ALL
    )
    private Set<Country> countries = new HashSet<>();


}
