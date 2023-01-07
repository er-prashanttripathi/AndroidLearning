package com.example.android.threejantwentythree_one

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.threejantwentythree_one.R.*
import com.example.android.threejantwentythree_one.R.id.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val a1=findViewById<Button>(R.id.btn1)
        a1.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}