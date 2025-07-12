package com.kailash.ecommercespringboot.gateway;

import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {
    public List<CategoryDTO> getAllCategories() throws IOException;
}
