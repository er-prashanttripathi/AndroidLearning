package com.example.android.threejantwentythree

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_a)
        val a1=findViewById<Button>(R.id.btn21)
        a1.setOnClickListener {
            startActivity(Intent(this@MainActivity,R.layout.activity_basic_a::class.java))
        }
    }
}
