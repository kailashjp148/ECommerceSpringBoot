package com.kailash.ecommercespringboot.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class FakeStoreProductResponseDTO {

    private String status;

    private String message;

    @JsonProperty("product")
    private ProductDetailsDto  product;
}
