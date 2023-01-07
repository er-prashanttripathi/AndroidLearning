package com.example.android.analysis

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var button2=findViewById<Button>(R.id.btnnew)
        button2.setOnClickListener {
           startActivity(Intent(this@MainActivity2,R.layout.activity_main::class.java))
        }
    }
}