package com.kailash.ecommercespringboot.gateway.impl;

import com.kailash.ecommercespringboot.dto.CategoryDTO;
import com.kailash.ecommercespringboot.dto.FakeStoreCategoryResponseDTO;
import com.kailash.ecommercespringboot.dto.ProductDetailsDto;
import com.kailash.ecommercespringboot.gateway.ICategoryGateway;
import com.kailash.ecommercespringboot.gateway.IProductGateway;
import com.kailash.ecommercespringboot.mapper.FakeStoreCatResptoProdMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component("fakeStoreRestTemplateCategoryGateway")
public class FakeStoreRestTemplateCategoryGateway implements ICategoryGateway {

    private final RestTemplate restTemplate;


    @Value("${fakeStore.baseUrl}")
    private String baseUrl;

    public FakeStoreRestTemplateCategoryGateway(RestTemplate restTemplate)
    {
        this.restTemplate=restTemplate;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {

        String url=baseUrl+"products/category";

        ResponseEntity<FakeStoreCategoryResponseDTO> response=restTemplate.getForEntity(url,FakeStoreCategoryResponseDTO.class);

        if(response==null || response.getBody()==null)
            throw new IOException("No categories found");

        FakeStoreCategoryResponseDTO body=response.getBody();

        log.info("Status and headers: "+ response.getStatusCode() + response.getHeaders());


        return FakeStoreCatResptoProdMapper.toCategoryDto(body);

    }
}
