package com.example.android.mvvmretrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.mvvmretrofit.model.News
import com.example.android.mvvmretrofit.repository.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel(private val newsRepository: NewsRepository):ViewModel() {
    init {
        viewModelScope.launch (Dispatchers.IO){
            newsRepository.getNews()
        }

    }
    val news:LiveData<News>
    get() = newsRepository.news
}