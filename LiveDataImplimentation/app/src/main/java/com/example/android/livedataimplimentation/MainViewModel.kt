package com.example.android.livedataimplimentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel (){
    val factsLiveDataObject=MutableLiveData<String>("This is a fact")
    val factsLiveData:LiveData<String>
    get() = factsLiveDataObject

    //live data will be called from here
    fun updatelivedata(){
        factsLiveDataObject.value="Another New text"
    }
}