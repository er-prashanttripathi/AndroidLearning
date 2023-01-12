package com.example.android.myapplication

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG: String = "logTrialFun"
        lateinit var counterText: TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        counterText = findViewById(R.id.counter)
        Log.d(TAG, "${Thread.currentThread().name}")
        var btn = findViewById<Button>(R.id.updateCounter)
        btn.setOnClickListener {
            Log.d(TAG, "${Thread.currentThread().name}")
            updateCounter(counterText)
        }

    }

    /*   fun updateCounter(counterText: TextView) {
            Log.d(TAG, "${Thread.currentThread().name}")
           counterText.text ="${counterText.text.toString().toInt()+1}"
       }*/
    private fun anyLongRunTask() {
        for (i in 1..1000000000L) {

        }
    }

    fun doAction(view: View) {
        CoroutineScope(Dispatchers.IO).launch {
            Log.d(TAG, "1- ${Thread.currentThread().name}")
        }
        GlobalScope.launch(Dispatchers.Main) {
            Log.d(TAG, "2- ${Thread.currentThread().name}")
        }
        MainScope().launch(Dispatchers.Default) {
            Log.d(TAG, "3   - ${Thread.currentThread().name}")
        }
/*        -------------solve using thread-----------------
        thread(start = true){
            anyLongRunTask()
        }*/
//        anyLongRunTask()
    }

    fun updateCounter(counterText: TextView) {
        Log.d(TAG, "${Thread.currentThread().name}")
        counterText.text = "${counterText.text.toString().toInt() + 1}"
    }
}