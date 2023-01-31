package com.example.android.mvvmretrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.mvvmretrofit.api.ApiInterface
import com.example.android.mvvmretrofit.model.News

class NewsRepository(private val apiInterface: ApiInterface) {
    private val newsLiveData = MutableLiveData<News>()
    val news: LiveData<News>
        get() = newsLiveData

    suspend fun getNews() {
        val result = apiInterface.getNews()
        if (result.body() != null) {
            newsLiveData.postValue(result.body())
        }
    }
}