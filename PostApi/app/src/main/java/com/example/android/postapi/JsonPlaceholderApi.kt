package com.example.android.postapi

import android.telecom.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface JsonPlaceholderApi {
    //https://jsonplaceholder.typicode.com/posts
    @POST("posts")//value after base url
    fun sendUserData(
        @Body userPost: UserPost
    ):retrofit2.Call<UserPost>

}