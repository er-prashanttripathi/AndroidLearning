package com.example.android.newslyrecyclerviewretrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.newslyrecyclerviewretrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding//Data Binding -1
    private var articles= mutableListOf<Article>()

    lateinit var adapter: NewsAdapter//to access adapter for recyView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)//Data Binding -2

        adapter= NewsAdapter(this@MainActivity,articles)
//                    var newsList=findViewById<RecyclerView>(R.id.newsList)
        binding.newsList.adapter=adapter//Data Binding -3
//        binding.newsList.layoutManager=LinearLayoutManager(this@MainActivity)//linear view scroll logic
        binding.newsList.layoutManager=GridLayoutManager(applicationContext,2)//Grid View scroll logic



//        val layoutManager=Stack(StackLayoutManger.ScrollOrientation.BOTTOM_TO_TOP)

        getNews()
    }

    private fun getNews() {
        val news = NewsService.newsInstance.headlines("in", 1)
        news.enqueue(object : Callback<News> {
            override fun onResponse(call: Call<News>, response: Response<News>) {
                val news = response.body()
                if (news != null) {
                    Log.d("Api_Calling", news.toString())

                    articles.addAll(news.articles)
                    adapter.notifyDataSetChanged()
                }
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.d("Api_Calling", "onFailure: ERROR IN FETCHING NEWS", t)
            }
        })
    }
}