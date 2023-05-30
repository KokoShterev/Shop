package com.example.proekt.controller.resources;

import lombok.Data;

@Data
public class ProductResource {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private Long categoryId;
    private Long userId;
}
