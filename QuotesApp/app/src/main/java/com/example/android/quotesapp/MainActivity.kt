package com.example.android.quotesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    private val quoteText: TextView
        get() = findViewById(R.id.txtQuote)
    private val quoteAuthor: TextView
        get() = findViewById(R.id.txtAuthor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(
            this,
            MainViewModelFactory(application)
        ).get(MainViewModel::class.java)
//        mainViewModel=ViewModelProvider(this,MainViewModelFactory(this)).get(MainViewModel::class.java)
        setQuote(mainViewModel.getQuote())
    }

    fun setQuote(quote: Quote) {
        quoteText.text = quote.text
        quoteAuthor.text = quote.author
    }

    fun onPrevious(view: View) {
        setQuote(mainViewModel.previousQuote())
    }

    fun onNext(view: View) {
        setQuote(mainViewModel.nextQuote())
    }

    fun onShare(view: View) {
//        Log.d("mainViewModelText", "onShare: ${mainViewModel.getQuote().text}")
//        val intentvar = Intent(Intent.ACTION_SEND)
//        intent.setType("text/plain")
//        intent.putExtra(Intent.EXTRA_TEXT, mainViewModel.getQuote().text)
//        startActivity(Intent.createChooser(intentvar,"Share this App Using"))
//        ------------------------------
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT,mainViewModel.getQuote().text)
        intent.type = "text/plain"
        startActivity(Intent.createChooser(intent, "Send"))
//        -------------------------------
    }
}