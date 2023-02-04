package com.example.android.mvvmretrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.unogetapi.apiinterface.apiInterface
import com.example.android.unogetapi.model.getCategory

class ItemRepository(private val apiInterface:apiInterface) {
    private val newsLiveData = MutableLiveData<getCategory>()
    val news: LiveData<getCategory>
        get() = newsLiveData

    suspend fun getData() {
        val result = apiInterface.getNews()
        if (result.body() != null) {
            newsLiveData.postValue(result.body())
        }
    }
}