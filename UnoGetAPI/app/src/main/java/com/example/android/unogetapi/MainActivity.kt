package com.example.android.unogetapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.mvvmretrofit.api.ApiInterface
import com.example.android.mvvmretrofit.api.ApiUtilities
import com.example.android.mvvmretrofit.repository.ItemRepository

package com.example.android.unogetapi
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.android.unogetapi.apiinterface.apiInterface
import com.example.android.unogetapi.apiinterface.apiUtilities
import com.example.android.unogetapi.repository.NewsRepository
import com.example.android.unogetapi.viewmodel.ViewModel
import com.example.android.unogetapi.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiInterface = ApiUtilities.getInstance().create(ApiInterface::class.java)
        val ItemRepository = ItemRepository(apiInterface)
        newViewModel = ViewModelProvider(
            this@MainActivity,
            ViewModelFactory(ItemRepository)
        ).get(NewViewModel::class.java)
        newViewModel.news.observe(this, {
            findViewById<TextView>(R.id.textViewmy).text = it.articles.toString()
        })

    }
}