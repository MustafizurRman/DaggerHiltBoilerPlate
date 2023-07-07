package com.example.daggerhiltsample.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface DummyApi {

    @GET("something")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    )
}