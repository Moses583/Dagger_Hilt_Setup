package com.ravemaster.daggerhilttutorial.data.repository

import android.app.Application
import android.widget.Toast
import com.ravemaster.daggerhilttutorial.R
import com.ravemaster.daggerhilttutorial.data.remote.MyApi
import com.ravemaster.daggerhilttutorial.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    private val appContext:Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }
    override suspend fun doApiCall() {

    }
}