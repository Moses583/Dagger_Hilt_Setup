package com.ravemaster.daggerhilttutorial.di

import android.app.Application
import com.ravemaster.daggerhilttutorial.data.remote.MyApi
import com.ravemaster.daggerhilttutorial.data.repository.MyRepositoryImpl
import com.ravemaster.daggerhilttutorial.domain.repository.MyRepository
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
    fun provideMyApi(): MyApi{
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }
    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi, app: Application): MyRepository{
        return MyRepositoryImpl(api,app)
    }

}