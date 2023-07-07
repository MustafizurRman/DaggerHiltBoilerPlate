package com.example.daggerhiltsample.data.remote

import retrofit2.http.GET

interface DummyApi{

    @GET("something")
    suspend fun doNetworkCall()
}