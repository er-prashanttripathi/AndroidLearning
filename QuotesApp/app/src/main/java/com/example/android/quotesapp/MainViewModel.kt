package com.example.android.quotesapp

import android.content.Context
import androidx.lifecycle.ViewModel
import com.google.gson.Gson

class MainViewModel(val mycontext: Context):ViewModel() {
    private var quoteList:Array<Quote> = emptyArray()
    private var index = 0
    init{
        quoteList=loadQuoteFromAsset()
    }

    private fun loadQuoteFromAsset(): Array<Quote> {
        val inputStream = mycontext.assets.open("quotes.json")
        val size:Int=inputStream.available()
        val buffer=ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val jsonmy =String(buffer,Charsets.UTF_8)
        val gsonmy=Gson()
        return gsonmy.fromJson(jsonmy,Array<Quote>::class.java)
    }

    fun getQuote()=quoteList[index]
    fun nextQuote()=quoteList[++index]
    fun previousQuote()=quoteList[--index]
}