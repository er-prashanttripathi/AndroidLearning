package com.example.android.twowaydatabindinglivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.twowaydatabindinglivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var mainViewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        /*mainViewModel.quoteLiveData.observe(this, Observer {
            binding.quoteText.text=it
        })*/
        binding.mainViewModel=mainViewModel
        binding.lifecycleOwner=this
    }
}