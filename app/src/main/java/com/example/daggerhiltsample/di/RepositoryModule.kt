package com.example.daggerhiltsample.di

import com.example.daggerhiltsample.data.domain.repository.MyRepository
import com.example.daggerhiltsample.data.remote.repository.MyRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/* This is a alternative method
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ):MyRepository
}*/
