package com.vk.directop.daggerhiltexample.di

import com.vk.directop.daggerhiltexample.data.repository.MyRepositoryImpl
import com.vk.directop.daggerhiltexample.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindsMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository

}