package com.example.android.databindingtrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.android.databindingtrial.databinding.ActivityDataBindingSpinnerBinding
import com.example.android.databindingtrial.databinding.ActivityMainBinding

class DataBindingSpinner : AppCompatActivity() {

    lateinit var bindVar:ActivityDataBindingSpinnerBinding
    val players= arrayOf("X","Y","Z","A","B","C","D","E")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindVar=DataBindingUtil.setContentView(this,R.layout.activity_data_binding_spinner)
        val spinnerVal=findViewById<Spinner>(R.id.spinnerDataid)
        val arrayAdapterone=ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,players)
        spinnerVal.adapter=arrayAdapterone
        spinnerVal.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Selected player is :"+players[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}