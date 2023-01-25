package com.example.android.kotlinretrofit

import retrofit2.Call
import retrofit2.http.GET


interface MyInterface {
    @GET("users")
    fun  getData():Call<List<MyDataItem>>
}