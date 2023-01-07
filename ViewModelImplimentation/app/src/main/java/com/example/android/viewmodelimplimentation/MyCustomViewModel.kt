package com.example.android.viewmodelimplimentation

import androidx.lifecycle.ViewModel

class MyCustomViewModel: ViewModel() {
    var count=0
    fun increment(){
        count++
    }
}