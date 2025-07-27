package com.kailash.ecommercespringboot.mapper;

import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.dto.FakeStoreCategoryResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class FakeStoreCatResptoProdMapper {

    public static List<CategoryDTO> toCategoryDto(FakeStoreCategoryResponseDTO fakeStoreCategoryResponseDTO)
    {
        return fakeStoreCategoryResponseDTO.getCategories()
                .stream()
                .map(category ->CategoryDTO.builder().name(category).build())
                .collect(Collectors.toList());
    }

    public static FakeStoreCategoryResponseDTO toFakeStoreCategoryDTO() {
        return null;
    }
}
