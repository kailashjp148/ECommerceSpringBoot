package com.kailash.ecommercespringboot.gateway.impl;

import com.kailash.ecommercespringboot.dto.FakeStoreProductResponseDTO;
import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.dto.ProductDto;
import com.kailash.ecommercespringboot.gateway.IProductGateway;
import com.kailash.ecommercespringboot.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway {

    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi)
    {
        this.fakeStoreProductApi=fakeStoreProductApi;
    }
    @Override
    public ProductDetailsDto getProduct(Long id) throws IOException {
        FakeStoreProductResponseDTO response=fakeStoreProductApi.getSingleFakeCategory(id).execute().body();

        if(response==null)
            throw new IOException("No response from fake store api");

        return response.getProduct();


    }
}
