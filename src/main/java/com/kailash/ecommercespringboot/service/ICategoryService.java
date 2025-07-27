package com.kailash.ecommercespringboot.service;

import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    public List<CategoryDTO> getAllCategories() throws IOException;

    public CategoryDTO createCategory(CategoryDTO categoryDTO);

    public CategoryDTO getByName(String name) throws Exception;


}
