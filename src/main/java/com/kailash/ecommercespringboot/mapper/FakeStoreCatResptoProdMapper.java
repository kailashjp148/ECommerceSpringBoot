package com.kailash.ecommercespringboot.mapper;

import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.dto.FakeStoreCategoryResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class FakeStoreCatResptoProdDto {

    public static List<CategoryDTO> toCategoryDto(FakeStoreCategoryResponseDTO fakeStoreCategoryResponseDTO)
    {
        return fakeStoreCategoryResponseDTO.getCategories()
                .stream()
                .map(CategoryDTO::new)
                .collect(Collectors.toList());
    }

    public static FakeStoreCategoryResponseDTO toFakeStoreCategoryDTO() {
        return null;
    }
}
