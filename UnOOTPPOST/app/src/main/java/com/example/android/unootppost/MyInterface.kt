package com.example.android.unootppost
import android.telecom.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface MyInterface {
    //https://jsonplaceholder.typicode.com/posts
    @POST("posts")//value after base url
    fun sendOTP(
        @Body otpPost: MyDataClass
    ):retrofit2.Call<MyDataClass>

}
