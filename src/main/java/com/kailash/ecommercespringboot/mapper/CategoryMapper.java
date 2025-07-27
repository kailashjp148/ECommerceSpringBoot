package com.kailash.ecommercespringboot.mapper;

import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.entity.Category;

public class CategoryMapper {

    public static Category toEnity(CategoryDTO categoryDTO)
    {
        return Category.builder()
                .name(categoryDTO.getName())
                .build();
    }

    public static CategoryDTO toDto(Category category)
    {
        return CategoryDTO.builder()
                .name(category.getName())
                .id(category.getId())
                .build();
    }
}
