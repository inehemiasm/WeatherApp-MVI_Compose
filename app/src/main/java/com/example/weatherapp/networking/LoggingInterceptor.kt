package com.example.weatherapp.networking

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

object LoggingInterceptor {
    private val interceptor = HttpLoggingInterceptor()
    fun loggingClient(): OkHttpClient {
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }
}
