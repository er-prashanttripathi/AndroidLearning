package com.example.android.slidecarousel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.slidecarousel.databinding.CarouselItemBinding

class MovieAdapter(private var movieList:List<MovieModel>):RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    class MovieViewHolder(val binding:CarouselItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding=CarouselItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie=movieList[position]
        holder.binding.apply {
            Glide.with(movieImage)
                .load(movie.Image)
                .into(movieImage)
            movieName.text=movie.name
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}