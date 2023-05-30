package com.example.proekt.controller.resources;

import lombok.Data;

@Data
public class ReviewResource {
    private Long id;
    private String comment;
    private Long productId;
    private Long userId;
}
