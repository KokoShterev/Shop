package com.example.proekt.mapper;

import com.example.proekt.controller.resources.ProductResource;
import com.example.proekt.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    public ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);

    //@Mapping()
    ProductResource toResource(Product product);

    Product fromResource(ProductResource productResource);
}
