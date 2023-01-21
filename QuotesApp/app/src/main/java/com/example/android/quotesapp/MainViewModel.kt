package com.example.android.quotesapp

import android.content.Context
import android.util.Log
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
//    fun nextQuote()=quoteList[++index]
    fun nextQuote():Quote{
        if (index!=(quoteList.size-1).toInt()){
            return quoteList[++index]
        }
    else
        {
        index=0
            return quoteList[index]
        }
    }
//    fun previousQuote()=quoteList[--index]
fun previousQuote():Quote {
    Log.d("SizeOfIndex", "previousQuote: ${index}")
    if (index != 0) {
        Log.d("checknotZeroSize", "previousQuote: ${quoteList.size}")
        return quoteList[--index]

    } else{
        Log.d("checkfinalSize", "previousQuote: ${quoteList.size}")
        index=(quoteList.size-1).toInt()
       return quoteList[index]
    }


}

}
