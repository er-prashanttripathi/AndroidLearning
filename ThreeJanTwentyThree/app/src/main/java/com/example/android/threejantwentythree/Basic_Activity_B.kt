package com.example.android.threejantwentythree

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Basic_Activity_B : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_b)
        var a3=findViewById<Button>(R.id.btn31)
        a3.setOnClickListener {
            startActivity(Intent(this,R.layout.activity_basic_c::class.java))
        }
    }
}