package com.example.databindingexample

import com.example.databindingexample.model.Person
import retrofit2.Call
import retrofit2.http.GET

interface Services {
    val BASE_URL: String
        get() = "https://simplifiedcoding.net/demos/"

    @GET("marvel")
    fun getPersonList(): Call<List<Person?>?>?
}