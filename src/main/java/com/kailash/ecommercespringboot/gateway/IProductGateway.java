package com.kailash.ecommercespringboot.gateway;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductDto;

import java.io.IOException;

public interface IProductGateway {

    public ProductDetailsDto getProduct(Long id) throws IOException;
}
