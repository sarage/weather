package com.example.theweatherapp.rest;

import com.example.theweatherapp.rest.dto.WeatherDataItemDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/data/2.5/weather")
    Call<WeatherDataItemDto> abc(@Query("APPID") String APPID, @Query("q") String q);
}