package com.example.daggerhiltsample.data.remote.repository

import android.app.Application
import android.util.Log
import com.example.daggerhiltsample.R
import com.example.daggerhiltsample.data.domain.repository.MyRepository
import com.example.daggerhiltsample.data.remote.DummyApi
import timber.log.Timber
import javax.inject.Inject

private const val TAG = "MyRepositoryImpl"

class MyRepositoryImpl @Inject constructor(private val dummyApi: DummyApi, private val appContext: Application) :
    MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        Timber.tag(TAG).d("Hello from repository the app name is %s", appName)
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}