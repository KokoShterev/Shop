package com.example.proekt.services.impl;

import static com.example.proekt.mapper.ReviewMapper.REVIEW_MAPPER;

public class ReviewServiceImpl {
    private final com.example.proekt.repository.ReviewRepository reviewRepository;

    public ReviewServiceImpl(com.example.proekt.repository.ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public java.util.List<com.example.proekt.controller.resources.ReviewResource> findAll() {
        return reviewRepository.findAll().stream().map(REVIEW_MAPPER::toResource).collect(java.util.stream.Collectors.toList());
    }

    public com.example.proekt.controller.resources.ReviewResource save(com.example.proekt.controller.resources.ReviewResource reviewResource) {
        com.example.proekt.entity.Review review = REVIEW_MAPPER.fromResource(reviewResource);
        return REVIEW_MAPPER.toResource(reviewRepository.save(review));
    }

    public com.example.proekt.controller.resources.ReviewResource update(com.example.proekt.controller.resources.ReviewResource reviewResource) {
        com.example.proekt.entity.Review review = REVIEW_MAPPER.fromResource(reviewResource);
        return REVIEW_MAPPER.toResource(reviewRepository.save(review));
    }
}
