package com.example.android.threejantwentythree

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Basic_Activity_C : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_c)
        var a4=findViewById<Button>(R.id.btn41)
        a4.setOnClickListener {
            startActivity(Intent(this,R.layout.activity_basic_d::class.java))
        }
    }
}