package com.kailash.ecommercespringboot.entity;

import jakarta.persistence.Entity;
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
    String category;
    Integer discount;
    Long id;
}
