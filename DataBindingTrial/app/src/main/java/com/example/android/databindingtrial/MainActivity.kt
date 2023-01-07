package com.example.android.databindingtrial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.databindingtrial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    lateinit var bindingObject: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val mainViewModel=ViewModelProvider(this@MainActivity).get(MainViewModel::class.java)
    //DataBindingUtil class is from DataBinding Libraries
     DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main).apply{
            this.setLifecycleOwner(this@MainActivity)
            this.viewmodel=mainViewModel
        }
        mainViewModel.editTextContent.observe(this,Observer{
            Toast.makeText(applicationContext,"${it}",Toast.LENGTH_SHORT).show()
        })
    }
}