package com.kailash.ecommercespringboot.controller;


import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.service.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private ICategoryService categoryService;

    CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() throws IOException {
        List<CategoryDTO> result= categoryService.getAllCategories();
        return ResponseEntity.ok(result);
    }




}
