package com.kailash.ecommercespringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity {

    String title;
    String image;
    Integer price;
    String description;
    String brand;
    String model;
    String color;

    @ManyToOne
    @JoinColumn(name="categoryId",nullable = false)
    Category category;

    Integer discount;
}
