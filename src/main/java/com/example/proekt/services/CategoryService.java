package com.example.proekt.services;

import com.example.proekt.controller.resources.CategoryResource;

import java.util.List;

public interface CategoryService {
    List<CategoryResource> findAll();
    CategoryResource save(CategoryResource categoryResource);
    CategoryResource update(CategoryResource categoryResource);
}
