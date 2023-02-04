package com.example.android.mvvmretrofit.api

import com.example.android.unogetapi.model.getCategory
import retrofit2.Response
import retrofit2.http.GET
//http://3.111.51.99:5000/api/v1/unorg/userapp/category
interface ApiInterface {
    @GET("/v1/unorg/userapp/category")
    suspend fun getNews():Response<getCategory>
}