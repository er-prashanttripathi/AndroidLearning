package com.example.android.mvvmretrofit.api

import com.example.android.mvvmretrofit.model.News
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/v2/top-headlines?sources=techcrunch&apiKey=0b26dc92503949ddb2d20cd254ded462")
    suspend fun getNews():Response<News>
}