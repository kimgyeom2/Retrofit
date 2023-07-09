package com.gy25m.retrofit

import retrofit2.http.GET

interface ApiService {
    @GET("https://jsonplaceholder.typicode.com/comments/")
    suspend fun getPersons(): List<Person>
}