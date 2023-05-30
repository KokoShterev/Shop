package com.example.proekt.services;

import com.example.proekt.controller.resources.ProductResource;

import java.util.List;

public interface ProductService {
    List<ProductResource> findAll();
    ProductResource save(ProductResource productResource);
    ProductResource update(ProductResource productResource);
}
