package com.kailash.ecommercespringboot.mapper;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
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
            .category(product.getCategory())
            .discount(product.getDiscount())
                .build();
    }

    public static Product toEntity(ProductDetailsDto product)
    {
        return Product.builder()
                .title(product.getTitle())
                .image(product.getImage())
                .price(product.getPrice())
                .description(product.getDescription())
                .brand(product.getBrand())
                .model(product.getModel())
                .color(product.getColor())
                .category(product.getCategory())
                .discount(product.getDiscount())
                .build();
    }
}
