package com.example.android.fragmenttrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1:Button=findViewById(R.id.btn1)
        val btn2:Button=findViewById(R.id.btn2)

        
         btn1.setOnClickListener{
             loadfrag1(
                 fragment_One()
             )
         }
        btn2.setOnClickListener{
            loadfrag2(
                fragment_Two()
            )


        }
    }
    fun loadfrag1(frag1:fragment_One){
        val ft =supportFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag1n2,frag1)
        ft.commit()
    }
    fun loadfrag2(frag2:fragment_Two){
        val ft =supportFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag1n2,frag2)
        ft.commit()
    }

}