package com.example.proekt.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


    // Constructors, getters, and setters
}
