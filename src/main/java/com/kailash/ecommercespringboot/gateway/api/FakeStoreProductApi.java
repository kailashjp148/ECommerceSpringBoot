package com.kailash.ecommercespringboot.gateway.api;

import com.kailash.ecommercespringboot.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<FakeStoreProductResponseDTO> getSingleFakeCategory(@Path("id") Long id);
}
