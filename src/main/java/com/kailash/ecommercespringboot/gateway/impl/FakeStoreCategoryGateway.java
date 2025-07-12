package com.kailash.ecommercespringboot.gateway.impl;

import com.kailash.ecommercespringboot.dto.*;
import com.kailash.ecommercespringboot.gateway.ICategoryGateway;
import com.kailash.ecommercespringboot.gateway.api.FakeStoreCategoryApi;
import com.kailash.ecommercespringboot.service.ICategoryService;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{

    private FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {

        FakeStoreCategoryResponseDTO response=fakeStoreCategoryApi.getAllFakeCategories().execute().body();

        if(response==null)
            throw new IOException("No categories found");

        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder().name(category).build())
                .collect(Collectors.toList());


    }

}
