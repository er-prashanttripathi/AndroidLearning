package com.example.android.twowaydatabindinglivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val quoteLiveData=MutableLiveData("This is live data value")

    fun updateQuote(){
        quoteLiveData.value="This is updated value"
    }
}