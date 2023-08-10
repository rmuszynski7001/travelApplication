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
public class  City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="country_id")
    private Country country;

    @JsonIgnore
    @OneToMany(mappedBy = "city",
            cascade = CascadeType.ALL
    )
    private Set<Hotel> hotels = new HashSet<>();


}
