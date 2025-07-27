package com.kailash.ecommercespringboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    Long id;

    String title;
    String image;
    Integer price;
    String description;
    String brand;
    String model;
    String color;
    CategoryDTO category;
    Integer discount;
}
