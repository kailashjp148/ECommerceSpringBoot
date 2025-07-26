package com.kailash.ecommercespringboot.service;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductDto;

import java.io.IOException;

public interface IProductService {
    public ProductDetailsDto getProduct(Long id) throws Exception;

    public ProductDetailsDto createProduct(ProductDetailsDto productDto);
}
