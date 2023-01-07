package com.example.android.databindingtrial

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val currentRandomFruitName:LiveData<String>
    get() = FakeRepositoryMy.currentRandomFruitName

    fun onChangeRandomFruitClick()=FakeRepositoryMy.changeCurrentRandomFruitName()
//    @Bindable
    val editTextContent=MutableLiveData<String>()

    private val _displayedEditTextContent=MutableLiveData<String>()
    val displayedEditTextContent:LiveData<String>
    get() = _displayedEditTextContent

    fun onDisplayEditTextContentClick(){
        _displayedEditTextContent.value=editTextContent.value
    }
    fun onSelectRandomEditTextFruit(){
        editTextContent.value=FakeRepositoryMy.getRandomFruitName()
    }
}