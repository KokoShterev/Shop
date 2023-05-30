package com.example.proekt.mapper;

import com.example.proekt.controller.resources.ReviewResource;
import com.example.proekt.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReviewMapper {
    public ReviewMapper REVIEW_MAPPER = Mappers.getMapper(ReviewMapper.class);

    //@Mapping()
    ReviewResource toResource(Review review);

    Review fromResource(ReviewResource reviewResource);
}
