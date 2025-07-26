package com.kailash.ecommercespringboot.controller;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.service.IProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(@Qualifier("productService") IProductService productService)
    {
        this.productService=productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDetailsDto> getProduct(@PathVariable Long id) throws Exception {
        ProductDetailsDto result=productService.getProduct(id);

        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<ProductDetailsDto> createProduct(@RequestBody ProductDetailsDto productDetailsDto)
    {
        return ResponseEntity.ok(productService.createProduct(productDetailsDto));
    }
}
