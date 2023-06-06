package com.example.proekt.services.impl;

import static com.example.proekt.mapper.ProductMapper.PRODUCT_MAPPER;

public class ProductServiceImpl {
    private final com.example.proekt.repository.ProductRepository productRepository;

    public ProductServiceImpl(com.example.proekt.repository.ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public java.util.List<com.example.proekt.controller.resources.ProductResource> findAll() {
        return productRepository.findAll().stream().map(PRODUCT_MAPPER::toResource).collect(java.util.stream.Collectors.toList());
    }


    public com.example.proekt.controller.resources.ProductResource save(com.example.proekt.controller.resources.ProductResource productResource) {
        com.example.proekt.entity.Product product = PRODUCT_MAPPER.fromResource(productResource);
        return PRODUCT_MAPPER.toResource(productRepository.save(product));
    }


    public com.example.proekt.controller.resources.ProductResource update(com.example.proekt.controller.resources.ProductResource productResource) {
        com.example.proekt.entity.Product product = PRODUCT_MAPPER.fromResource(productResource);
        return PRODUCT_MAPPER.toResource(productRepository.save(product));
    }
}
