package com.example.android.threejantwentythree

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Basic_Activity_D : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_d)
        var a5=findViewById<Button>(R.id.btn51)
        a5.setOnClickListener {
            startActivity(Intent(this,R.layout.activity_basic_e::class.java))
        }
    }
}