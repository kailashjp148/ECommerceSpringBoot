package com.kailash.ecommercespringboot.service.impl;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.dto.ProductWithCategoryDto;
import com.kailash.ecommercespringboot.entity.Category;
import com.kailash.ecommercespringboot.entity.Product;
import com.kailash.ecommercespringboot.exception.ProductNotFoundException;
import com.kailash.ecommercespringboot.mapper.ProductMapper;
import com.kailash.ecommercespringboot.repository.CategoryRepository;
import com.kailash.ecommercespringboot.repository.ProductRepository;
import com.kailash.ecommercespringboot.service.IProductService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository,CategoryRepository categoryRepository)
    {
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }

    @Override
    public ProductDetailsDto getProduct(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(()->new ProductNotFoundException("Product not found with id "+id));
    }

    @Override
    public ProductDetailsDto createProduct(ProductDetailsDto productDto) throws Exception {

        Category category=categoryRepository.findById(productDto.getCategoryId())
                .orElseThrow(() -> new Exception("Category not found "+ productDto.getCategoryId()));

        Product saved= productRepository.save(ProductMapper.toEntity(productDto,category));

        return ProductMapper.toDto(saved);
    }

    @Override
    public ProductWithCategoryDto getProductWithCategory(Long id) throws Exception {

        Product product=productRepository.findById(id)
                .orElseThrow(() -> new Exception("Product not found with Id "+id));

        return ProductMapper.toProductWithCategoryDto(product);


    }


}
