package com.ravemaster.daggerhilttutorial.data.remote

import retrofit2.http.GET

interface MyApi {
    @GET("test")
    suspend fun doApiCall()
}