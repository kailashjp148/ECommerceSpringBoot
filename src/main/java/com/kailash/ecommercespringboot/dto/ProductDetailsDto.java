package com.kailash.ecommercespringboot.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDetailsDto {

    Integer id;
    String title;
    String image;
   Integer price;
    String description;
    String brand;
    String model;
    String color;
    String category;
    Integer discount;
}
