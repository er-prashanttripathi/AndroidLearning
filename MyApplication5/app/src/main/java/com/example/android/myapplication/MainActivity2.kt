package com.example.android.myapplication

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        CoroutineScope(Dispatchers.Main).launch {
            task1()
        }
        CoroutineScope(Dispatchers.Main).launch {
            task2()
        }


    }
    suspend fun task1(){
        Log.d(TAG, "Starting task1: ")
//        yield()
        delay(1000)
        Log.d(TAG, "Ending task1: ")
    }
    suspend fun task2(){
        Log.d(TAG, "Starting task2: ")
//        yield()
        delay(4000)
        Log.d(TAG, "Ending task2: ")
    }
}