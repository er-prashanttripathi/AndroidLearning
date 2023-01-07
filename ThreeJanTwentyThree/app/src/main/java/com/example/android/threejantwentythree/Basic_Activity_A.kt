package com.example.android.threejantwentythree

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Basic_Activity_A : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_a)
        var a2=findViewById<Button>(R.id.btn21)
        a2.setOnClickListener {
            startActivity(Intent(this@Basic_Activity_A,R.layout.activity_basic_b::class.java))
        }
    }
}