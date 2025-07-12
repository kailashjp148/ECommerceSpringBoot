package com.kailash.ecommercespringboot.configuration;

import com.kailash.ecommercespringboot.gateway.api.FakeStoreCategoryApi;
import com.kailash.ecommercespringboot.gateway.api.FakeStoreProductApi;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroFitConfig {

    @Bean
    public Retrofit retroFit()
    {

        Dotenv dotenv = Dotenv.load();

        String baseUrl = dotenv.get("fakeStoreBaseUrl");
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit)
    {
        return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit)
    {
        return retrofit.create(FakeStoreProductApi.class);
    }

}
