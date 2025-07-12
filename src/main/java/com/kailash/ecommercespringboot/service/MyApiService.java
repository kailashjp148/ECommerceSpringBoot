package com.kailash.ecommercespringboot.service;

import com.kailash.ecommercespringboot.model.Tasks;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MyApiService {
    @GET("todos/3")
    Call<Tasks> getUser();
}
