package com.example.android.databindingtrial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.Random

object FakeRepositoryMy {
    private val fruitNames: List<String> = listOf(
            "Apple","Banana","Orange","Kiwi","Grapes","Fig"
    )
    private val _currentRandomFruitName=MutableLiveData<String>()// so that mutable live data cannot be exposed outside classes
    val currentRandomFruitName:LiveData<String>// only expose live data whose value can be changed but only within FAkeRepository class
    get() = _currentRandomFruitName
    init {
        _currentRandomFruitName.value= fruitNames.first()
    }
    fun getRandomFruitName():String{
        val randomValueHolder= Random()
        return fruitNames[randomValueHolder.nextInt(fruitNames.size)]
    }
    fun changeCurrentRandomFruitName(){
        _currentRandomFruitName.value= getRandomFruitName()
    }
}