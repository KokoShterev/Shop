package com.example.proekt.services.impl;

import static com.example.proekt.mapper.UserMapper.USER_MAPPER;
public class UserServiceImpl {
    private final com.example.proekt.repository.UserRepository userRepository;

    public UserServiceImpl(com.example.proekt.repository.UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public java.util.List<com.example.proekt.controller.resources.UserResource> findAll() {
        return userRepository.findAll().stream().map(USER_MAPPER::toResource).collect(java.util.stream.Collectors.toList());
    }

    public com.example.proekt.controller.resources.UserResource save(com.example.proekt.controller.resources.UserResource userResource) {
        com.example.proekt.entity.User user = USER_MAPPER.fromResource(userResource);
        return USER_MAPPER.toResource(userRepository.save(user));
    }

    public com.example.proekt.controller.resources.UserResource update(com.example.proekt.controller.resources.UserResource userResource) {
        com.example.proekt.entity.User user = USER_MAPPER.fromResource(userResource);
        return USER_MAPPER.toResource(userRepository.save(user));
    }
}
