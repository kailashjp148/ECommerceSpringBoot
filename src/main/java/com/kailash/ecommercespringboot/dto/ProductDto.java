package com.kailash.ecommercespringboot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private int id;

    private String title;

    private Integer price;

    private String brand;

}
