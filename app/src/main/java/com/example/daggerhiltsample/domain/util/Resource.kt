package com.example.daggerhiltsample.domain.util

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Loading<T>(data:T?):Resource<T>(data)
    class Success<T>(data:T?):Resource<T>(data)
    class Error<T>(data:T?, message: String):Resource<T>(data,message)
}