package com.example.android.mvvmretrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.mvvmretrofit.repository.ItemRepository

import com.example.android.unogetapi.model.getCategory
import com.example.android.unogetapi.model.getCategoryItem
     // mvvmretrofit.repository.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel(private val itemRepository: ItemRepository):ViewModel() {
    init {
        viewModelScope.launch (Dispatchers.IO){
            ItemRepository.getData()
        }

    }
    val news:LiveData<getCategory>
        get() = itemRepository.news
}