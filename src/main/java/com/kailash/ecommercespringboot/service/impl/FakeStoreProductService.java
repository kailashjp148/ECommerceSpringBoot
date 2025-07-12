package com.kailash.ecommercespringboot.service.impl;

import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.gateway.IProductGateway;
import com.kailash.ecommercespringboot.service.ICategoryService;
import com.kailash.ecommercespringboot.service.IProductService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway)
    {
        this.productGateway=productGateway;
    }
    @Override
    public ProductDto getProduct(Long id) throws IOException {

        ProductDetailsDto productDetails=productGateway.getProduct(id);

        return ProductDto.builder().id(productDetails.getId()).title(productDetails.getTitle()).price(productDetails.getPrice()).brand(productDetails.getBrand()).build();
    }
}
