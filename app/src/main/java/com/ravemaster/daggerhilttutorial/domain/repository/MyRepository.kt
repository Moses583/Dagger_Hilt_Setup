package com.ravemaster.daggerhilttutorial.domain.repository

interface MyRepository {
    suspend fun doApiCall()
}