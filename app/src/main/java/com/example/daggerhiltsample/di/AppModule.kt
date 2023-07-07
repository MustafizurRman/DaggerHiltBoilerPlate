package com.example.daggerhiltsample.di

import android.app.Application
import com.example.daggerhiltsample.data.domain.repository.MyRepository
import com.example.daggerhiltsample.data.remote.DummyApi
import com.example.daggerhiltsample.data.remote.repository.MyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDummyApi(): DummyApi {
        return Retrofit.Builder().baseUrl("https://test.com").build().create(DummyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(dummyApi: DummyApi, app: Application): MyRepository {
        return MyRepositoryImpl(dummyApi, app)
    }
}