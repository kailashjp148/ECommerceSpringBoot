package com.kailash.ecommercespringboot.service.impl;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.entity.Product;
import com.kailash.ecommercespringboot.mapper.ProductMapper;
import com.kailash.ecommercespringboot.repository.ProductRepository;
import com.kailash.ecommercespringboot.service.IProductService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository=productRepository;
    }

    @Override
    public ProductDetailsDto getProduct(Long id) throws Exception {
        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(()->new Exception("Product not found"));
    }

    @Override
    public ProductDetailsDto createProduct(ProductDetailsDto productDto) {
        Product saved= productRepository.save(ProductMapper.toEntity(productDto));

        return ProductMapper.toDto(saved);
    }
}
