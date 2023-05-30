package com.example.proekt.services;

import com.example.proekt.controller.resources.UserResource;

import java.util.List;

public interface UserService {
    List<UserResource> findAll();
    UserResource save(UserResource userResource);
    UserResource update(UserResource userResource);
}
