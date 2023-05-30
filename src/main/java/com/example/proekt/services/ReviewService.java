package com.example.proekt.services;

import com.example.proekt.controller.resources.ReviewResource;

import java.util.List;

public interface ReviewService {
    List<ReviewResource> findAll();
    ReviewResource save(ReviewResource reviewResource);
    ReviewResource update(ReviewResource reviewResource);
}
