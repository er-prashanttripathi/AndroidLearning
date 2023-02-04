package com.example.android.mvvmretrofit.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.android.unogetapi.repository.ItemRepository
import com.example.android.unogetapi.viewmodel.MyViewModel

class MyViewModelFactory(val itemRepository: ItemRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return MyViewModel(itemRepository) as T
    }
}