package com.example.android.any

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.android.any.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var refViewModel:ViewModelFile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        var myObj = EmployeeDataClass("Mr X", "xyz.pvt.ltd", "Dy.ASP", "10", "XYZeepur", "20", "China")
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        refViewModel=ViewModelProvider(this).get(ViewModelFile::class.java)

//        binding.anyViewModel = myObj
        binding.anyViewModel=EmployeeDataClass()

    }
}