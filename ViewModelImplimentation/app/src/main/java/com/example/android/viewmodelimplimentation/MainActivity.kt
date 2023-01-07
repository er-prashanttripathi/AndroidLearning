package com.example.android.viewmodelimplimentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textView: TextView

    private lateinit var myMainViewModel: MyCustomViewModel
//    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    myMainViewModel=ViewModelProvider(this).get(MyCustomViewModel::class.java)
        button=findViewById(R.id.IdOfButton)
        textView=findViewById(R.id.IdOfTextView)
        setText()
        button.setOnClickListener {
            increment()
        }
    }
    fun setText(){
//        textView.text=count.toString()
        textView.text=myMainViewModel.count.toString()
    }
    private fun increment(){
//        count++;
        myMainViewModel.increment()
        setText()

    }
}