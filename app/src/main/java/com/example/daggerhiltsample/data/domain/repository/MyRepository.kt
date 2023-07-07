package com.example.daggerhiltsample.data.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}