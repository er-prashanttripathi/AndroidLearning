package com.example.android.lifecycleobserver

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Main", "onCreate: ObserverOfMainActivityKt")

        lifecycle.addObserver(MyObserver())
    }
}