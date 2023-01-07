package com.example.android.threejantwentythree

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Basic_Activity_E : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_e)
        var a6=findViewById<Button>(R.id.btn61)
        a6.setOnClickListener {
            startActivity(Intent(this,R.layout.activity_basic_f::class.java))
        }
    }
}