package com.example.android.databindingimplimentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android.databindingimplimentation.databinding.ActivityMainBinding

//----------------------------------------------------------
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val quoteTextView=findViewById<TextView>(R.id.quoteText)
//        val quoteAuthorView=findViewById<TextView>(R.id.quoteAuthor)
//
//        quoteTextView.text="Do or Do not,There is no Try."
//        quoteAuthorView.text="Yoda"
//-----------------------------------------------------------
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.quoteText.text="Do or Do not,There is no Try."
        binding.quoteAuthor.text="Yoda"

    }
}