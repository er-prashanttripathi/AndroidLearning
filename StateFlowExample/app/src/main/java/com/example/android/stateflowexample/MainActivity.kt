package com.example.android.stateflowexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.android.stateflowexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel:MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        counterResult()
        }


    private fun counterResult() {
        lifecycleScope.launchWhenStarted {
            mainViewModel.counter.collect{counter->
                binding.result.text=counter.toString()
            }
        }
    }

    private fun init(){
        binding.increment.setOnClickListener{
            mainViewModel.incrementState()
        }
        binding.decrement.setOnClickListener{
            mainViewModel.derementState()
        }
    }
}