package com.example.daggerhiltsample.data.remote.repository

import android.app.Application
import android.util.Log
import com.example.daggerhiltsample.R
import com.example.daggerhiltsample.data.domain.repository.MyRepository
import com.example.daggerhiltsample.data.remote.DummyApi

private const val TAG = "MyRepositoryImpl"

class MyRepositoryImpl(private val dummyApi: DummyApi, private val appContext: Application) :
    MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        Log.d(TAG, "Hello from repository the app name is $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}