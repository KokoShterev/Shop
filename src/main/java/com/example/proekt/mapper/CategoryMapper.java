package com.example.proekt.mapper;

import com.example.proekt.controller.resources.CategoryResource;
import com.example.proekt.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    public CategoryMapper CATEGORY_MAPPER = Mappers.getMapper(CategoryMapper.class);

    //@Mapping()
    CategoryResource toResource(Category category);

    Category fromResource(CategoryResource categoryResource);
}
