package com.gy25m.retrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

        private const val BASE_URL = "https://jsonplaceholder.typicode.com/comments/"

        private val retrofit: Retrofit by lazy {
            val gson = GsonBuilder().create()

            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }

        val apiService: ApiService by lazy {
            retrofit.create(ApiService::class.java)
        }

}