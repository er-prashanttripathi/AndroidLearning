package com.example.android.m1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //name of button used to render/(intent pass)
        btnNext.setOnClickListener {

            startActivity(Intent(this@MainActivity,M2::class.java))
        }



    }
}