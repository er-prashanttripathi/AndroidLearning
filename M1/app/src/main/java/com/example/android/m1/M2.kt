package com.example.android.m1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_m2.*
import kotlinx.android.synthetic.main.activity_main.*

class M2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m2)

        btnNext1.setOnClickListener {

            startActivity(Intent(this@M2,M3::class.java))


        }
    }
}