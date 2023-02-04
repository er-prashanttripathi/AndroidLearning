package com.example.android.mvvmretrofit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//http://3.111.51.99:5000/api/v1/unorg/userapp/category
object ApiUtilities {
    val BASE_URL="//http://3.111.51.99:5000/api/"
    fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}