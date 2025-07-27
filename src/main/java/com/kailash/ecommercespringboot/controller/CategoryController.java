package com.kailash.ecommercespringboot.controller;


import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private ICategoryService categoryService;

    CategoryController(@Qualifier("categoryService")
                       ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<?> getAllCategories(@RequestParam(required = false) String name) throws Exception {

        if(name!=null && !name.isEmpty())
        {
            CategoryDTO categoryDTO=categoryService.getByName(name);
            return ResponseEntity.ok(categoryDTO);
        }
        else {
            List<CategoryDTO> result = categoryService.getAllCategories();
            return ResponseEntity.ok(result);
        }
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDto)
    {
        CategoryDTO category=categoryService.createCategory(categoryDto);

        return ResponseEntity.ok(category);
    }

}
