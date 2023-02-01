package com.example.android.postapi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.postapi.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
//        binding=DataBindingUtil.
        binding = DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)

        //Retrofit Builder
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .build()
        val jsonPlaceholderApi = retrofitBuilder.create(JsonPlaceholderApi::class.java)
        val userPost = UserPost(1, 12, "Heading", "Body of Post data")
        val call = jsonPlaceholderApi.sendUserData(userPost)
        call.enqueue(object : Callback<UserPost> {
            override fun onResponse(call: Call<UserPost>, response: Response<UserPost>) {
                val r=findViewById<TextView>(R.id.myText)
                r.text = response.code().toString()
            }

            override fun onFailure(call: Call<UserPost>, t: Throwable) {

                val r=findViewById<TextView>(R.id.myText)
                r.text = t.message.toString()

            }
        })
        //Data send

    }
}