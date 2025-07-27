package com.kailash.ecommercespringboot.service.impl;


import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.entity.Category;
import com.kailash.ecommercespringboot.mapper.CategoryMapper;
import com.kailash.ecommercespringboot.mapper.ProductMapper;
import com.kailash.ecommercespringboot.repository.CategoryRepository;
import com.kailash.ecommercespringboot.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;


    public CategoryService(CategoryRepository categoryRepository)
    {
        this.categoryRepository=categoryRepository;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
            return categoryRepository.findAll()
                    .stream()
                    .map(category-> CategoryMapper.toDto(category))
                    .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category=categoryRepository.save(CategoryMapper.toEnity(categoryDTO));

        return CategoryMapper.toDto(category);
    }

    @Override
    public CategoryDTO getByName(String name) throws Exception {
        return categoryRepository.findByName(name)
                .map(CategoryMapper::toDto)
                .orElseThrow(()-> new Exception("Category not found with name "+name));

    }
}
