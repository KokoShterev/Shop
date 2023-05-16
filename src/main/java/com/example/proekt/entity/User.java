package com.example.proekt.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "orders")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String role;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    // Constructors, getters, and setters
}
