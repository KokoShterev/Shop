package com.example.proekt.services.impl;

import static com.example.proekt.mapper.AddressMapper.ADDRESS_MAPPER;
import static com.example.proekt.mapper.CategoryMapper.CATEGORY_MAPPER;

public class CategoryServiceImpl implements com.example.proekt.services.CategoryService{
    private final com.example.proekt.repository.CategoryRepository categoryRepository;

    public CategoryServiceImpl(com.example.proekt.repository.CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public java.util.List<com.example.proekt.controller.resources.CategoryResource> getAll() {
        return categoryRepository.findAll().stream().map(CATEGORY_MAPPER::toResource).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public com.example.proekt.controller.resources.CategoryResource getById(Long id) {
        return CATEGORY_MAPPER.toResource(categoryRepository.getById(id));
    }

    @Override
    public com.example.proekt.controller.resources.CategoryResource save(com.example.proekt.controller.resources.CategoryResource category) {
        return CATEGORY_MAPPER.toResource(categoryRepository.save(CATEGORY_MAPPER.fromResource(category)));
    }
    @Override
    public com.example.proekt.controller.resources.CategoryResource update(com.example.proekt.controller.resources.CategoryResource categoryResource) {
        com.example.proekt.entity.Category category = CATEGORY_MAPPER.fromResource(categoryResource);
        return CATEGORY_MAPPER.toResource(categoryRepository.save(category));
    }
    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
