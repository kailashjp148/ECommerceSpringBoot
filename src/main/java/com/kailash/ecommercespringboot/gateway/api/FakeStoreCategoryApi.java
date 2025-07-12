package com.kailash.ecommercespringboot.gateway.api;

import com.kailash.ecommercespringboot.dto.FakeStoreCategoryResponseDTO;
import com.kailash.ecommercespringboot.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;


public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllFakeCategories();


}
