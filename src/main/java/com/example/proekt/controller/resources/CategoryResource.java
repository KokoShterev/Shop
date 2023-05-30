package com.example.proekt.controller.resources;
import lombok.Data;

@Data
public class CategoryResource {
    private Long id;
    private String name;
    private String description;
    private Long parentId;
}
