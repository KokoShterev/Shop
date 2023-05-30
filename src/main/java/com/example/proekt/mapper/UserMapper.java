package com.example.proekt.mapper;

import com.example.proekt.controller.resources.UserResource;
import com.example.proekt.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    public UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    //@Mapping()
    UserResource toResource(User user);

    User fromResource(UserResource userResource);
}
