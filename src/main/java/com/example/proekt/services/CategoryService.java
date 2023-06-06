package com.example.proekt.services;

import com.example.proekt.controller.resources.CategoryResource;

import java.util.List;

public interface CategoryService {
    List<CategoryResource> getAll();
    CategoryResource getById(Long id);
    CategoryResource save(CategoryResource categoryResource);
    CategoryResource update(CategoryResource categoryResource);
    void delete(Long id);
}
