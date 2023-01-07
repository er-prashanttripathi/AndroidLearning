package com.example.android.myapplicationthreejan

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        /*val receiveVar=intent.getStringExtra("var_passdata")
        val edttxtvar=findViewById<TextView>(R.id.textView).apply {
            text=receiveVar*/
        val receiveVar=intent.getStringExtra("var_passdata")
        val edttxtvar=findViewById<TextView>(R.id.textView)
        edttxtvar.text=receiveVar
/*            edttxtvar.apply {
            text=receiveVar
        }*/
    }
}