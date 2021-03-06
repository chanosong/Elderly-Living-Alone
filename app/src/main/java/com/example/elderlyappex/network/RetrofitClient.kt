package com.example.elderlyappex.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var instance: Retrofit?=null
    private val gson = GsonBuilder().setLenient().create()

    private const val BASE_URL = "http://14.52.69.42:3000"

    //SingleTon
    fun getInstance(): Retrofit{
        if(instance == null){
            instance = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }

        return instance!!
    }
}