package com.kailash.ecommercespringboot.service;

import com.kailash.ecommercespringboot.dto.ProductDto;

import java.io.IOException;

public interface IProductService {
    public ProductDto getProduct(Long id) throws IOException;
}
