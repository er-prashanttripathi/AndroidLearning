package com.example.android.unootppost

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts.SettingsColumns.KEY
import android.util.Log
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android.unootppost.databinding.ActivityMainBinding
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)

        //Retrofit Builder
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .client(getokHttpClient(applicationContext))
            .build()

        val myInterface = retrofitBuilder.create(MyInterface::class.java)
        val otpPost = MyDataClass("9956101951")
        val call = myInterface.sendOTP(otpPost)
        call.enqueue(object : Callback<MyDataClass> {

            override fun onResponse(call: Call<MyDataClass>, response: Response<MyDataClass>) {

               binding.myText.text = response.body().toString()
                Log.d("OnSuccessful", "onResponse:${response.body().toString()} ")
            }

            override fun onFailure(call: Call<MyDataClass>, t: Throwable) {
                binding.myText.text = t.message.toString()
                Log.d("OnSuccessful", "onFailure:${t.message.toString()} ")
            }
        })
    }
}
private fun getokHttpClient(context: Context): OkHttpClient {
    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    return OkHttpClient.Builder()
        .connectTimeout(5, TimeUnit.MINUTES) // connect timeout
        .writeTimeout(5, TimeUnit.MINUTES) // write timeout
        .readTimeout(5, TimeUnit.MINUTES) // read timeout
        .addInterceptor(loggingInterceptor)
        /** this line comment when you publish app */

        .build()
}
