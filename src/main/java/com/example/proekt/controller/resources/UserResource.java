package com.example.proekt.controller.resources;

import lombok.Data;

@Data
public class UserResource {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
}
