package com.kailash.ecommercespringboot.controller;

import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService)
    {
        this.productService=productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) throws IOException {
        ProductDto result=productService.getProduct(id);

        return ResponseEntity.ok(result);
    }
}
