package com.kailash.ecommercespringboot.mapper;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductWithCategoryDto;
import com.kailash.ecommercespringboot.entity.Category;
import com.kailash.ecommercespringboot.entity.Product;

public class ProductMapper {

    public static ProductDetailsDto toDto(Product product)
    {
        return ProductDetailsDto.builder()
                .id(product.getId())
                .title(product.getTitle())
                .image(product.getImage())
            .price(product.getPrice())
            .description(product.getDescription())
            .brand(product.getBrand())
            .model(product.getModel())
            .color(product.getColor())
            .categoryId(product.getCategory().getId())
            .discount(product.getDiscount())
                .build();
    }

    public static Product toEntity(ProductDetailsDto product, Category category)
    {
        return Product.builder()
                .title(product.getTitle())
                .image(product.getImage())
                .price(product.getPrice())
                .description(product.getDescription())
                .brand(product.getBrand())
                .model(product.getModel())
                .color(product.getColor())
               .category(category)
                .discount(product.getDiscount())
                .build();
    }

    public static ProductWithCategoryDto toProductWithCategoryDto(Product product)
    {
        return ProductWithCategoryDto.builder()
                .id(product.getId())
                .title(product.getTitle())
                .image(product.getImage())
                .price(product.getPrice())
                .description(product.getDescription())
                .brand(product.getBrand())
                .model(product.getModel())
                .color(product.getColor())
                .category(CategoryMapper.toDto(product.getCategory()))
                .discount(product.getDiscount())
                .build();
    }
}
