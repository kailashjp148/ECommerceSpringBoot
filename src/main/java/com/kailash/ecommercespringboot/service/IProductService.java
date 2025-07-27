package com.kailash.ecommercespringboot.service;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.dto.ProductWithCategoryDto;

import java.io.IOException;

public interface IProductService {
    public ProductDetailsDto getProduct(Long id) throws Exception;

    public ProductDetailsDto createProduct(ProductDetailsDto productDto) throws Exception;

    public ProductWithCategoryDto getProductWithCategory(Long id) throws Exception;
}
