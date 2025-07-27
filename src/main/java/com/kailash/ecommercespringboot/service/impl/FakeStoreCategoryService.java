package com.kailash.ecommercespringboot.service.impl;

import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.gateway.ICategoryGateway;
import com.kailash.ecommercespringboot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {

    private ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(@Qualifier
    ("fakeStoreRestTemplateCategoryGateway") ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return categoryGateway.getAllCategories();
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public CategoryDTO getByName(String name) {
        return null;
    }
}
