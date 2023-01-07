package com.example.android.analysis

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        Toast.makeText(this, "Ans is: " + "$c", Toast.LENGTH_SHORT).show()
        var button1 = findViewById<Button>(R.id.btnClick)
        button1.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        var btnsumfun=findViewById<Button>(R.id.btnsum2)
        btnsumfun.setOnClickListener {
            add()
        }

    }

    fun add() {
     /*   var a = findViewById<EditText>(R.id.edttxt1)
        var b = findViewById<EditText>(R.id.edttxt2)
        var val1 = a.text.toString().toInt()
        var val2 = b.text.toString().toInt()
        var c: Int = val1 + val2
        Toast.makeText(this, "Ans is: " + "$c", Toast.LENGTH_SHORT).show()*/
        startActivity(Intent(this@MainActivity,MainActivity2::class.java))
    }
}
