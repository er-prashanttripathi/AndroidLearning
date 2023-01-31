package com.example.android.mvvmretrofit

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.android.mvvmretrofit.api.ApiInterface
import com.example.android.mvvmretrofit.api.ApiUtilities
import com.example.android.mvvmretrofit.repository.NewsRepository
import com.example.android.mvvmretrofit.viewmodel.NewsViewModel
import com.example.android.mvvmretrofit.viewmodel.NewsViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var newsViewModel: NewsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface = ApiUtilities.getInstance().create(ApiInterface::class.java)
        val newsRepository = NewsRepository(apiInterface)
        newsViewModel = ViewModelProvider(
            this@MainActivity,
            NewsViewModelFactory(newsRepository)
        ).get(NewsViewModel::class.java)
        newsViewModel.news.observe(this, {
            findViewById<TextView>(R.id.textViewmy).text = it.articles.toString()
        })

    }
}