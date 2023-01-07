package com.example.android.threejantwentythree

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Basic_Activity_F : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_f)
        var a7=findViewById<Button>(R.id.btn71)
        a7.setOnClickListener {
            startActivity(Intent(this,R.layout.activity_main::class.java))
        }
    }
}