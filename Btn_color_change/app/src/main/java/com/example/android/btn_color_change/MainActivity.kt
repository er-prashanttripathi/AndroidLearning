package com.example.android.btn_color_change

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById(R.id.button)
        button.setOnClickListener {
//            ------------------------------
//            button.isSelected=true
//
////            -------------------------------------------------
//           if ( button.isSelected==false)
//               button.isSelected=true
//            else
//               button.isSelected=false
//            --------------------------------------------
            button.setBackgroundColor(Color.rgb(130,59,36))
            button.setTextColor(Color.rgb(255,255,255))
        }
    }
}