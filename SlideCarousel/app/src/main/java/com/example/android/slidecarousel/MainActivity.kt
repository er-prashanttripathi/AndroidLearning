package com.example.android.slidecarousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.slidecarousel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding//Data Binding -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        val movieList=ArrayList<MovieModel>()
        movieList.add(MovieModel(R.drawable.lagaan,"Lagaan"))
        movieList.add(MovieModel(R.drawable.adam,"Black Adam"))
        movieList.add(MovieModel(R.drawable.msmarvel,"Ms Marvel"))
        movieList.add(MovieModel(R.drawable.hp,"Harry Potter"))
        movieList.add(MovieModel(R.drawable.joker,"joker"))
        movieList.add(MovieModel(R.drawable.jurassic,"jurassic park"))
        movieList.add(MovieModel(R.drawable.wanda,"wanda Vision"))
        movieList.add(MovieModel(R.drawable.nineseventeen,"nineseventeen"))

        val adapter=MovieAdapter(movieList)
        binding.apply {
            carouselRecyclerViewId.adapter=adapter
            carouselRecyclerViewId.set3DItem(true)
            carouselRecyclerViewId.setAlpha(true)
            carouselRecyclerViewId.setInfinite(true)
        }
    }
}