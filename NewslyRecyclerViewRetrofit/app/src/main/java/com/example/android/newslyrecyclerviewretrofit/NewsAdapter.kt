package com.example.android.newslyrecyclerviewretrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.newslyrecyclerviewretrofit.databinding.ItemLayoutBinding

/*
//---------------Using FindViewByID------------------
//View HOlder
class NewsAdapter(val context: Context,val articles:List<Article>):RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>(){
    class ArticleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var newsImage=itemView.findViewById<ImageView>(R.id.newsImage)
        var newsTitle=itemView.findViewById<TextView>(R.id.newsTitle)
        var newsDescription=itemView.findViewById<TextView>(R.id.newsDescription)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
         val view=LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article=articles[position]
        holder.newsTitle.text=article.title
        holder.newsDescription.text=article.description
// load image using glide
        Glide.with(context).load(article.urlToImage).into(holder.newsImage)

    }

    override fun getItemCount(): Int {
        return articles.size
    }
}
*/
//---------------Using Data Binding------------------
//View HOlder
class NewsAdapter(val context: Context,val articles:List<Article>):RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>(){
    class ArticleViewHolder(val binding: ItemLayoutBinding):RecyclerView.ViewHolder(binding.root){
        var newsImage=binding.newsImage
        var newsTitle=binding.newsTitle
        var newsDescription=binding.newsDescription


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false)
        return ArticleViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article=articles[position]
        holder.binding.newsTitle.text=article.title
        holder.binding.newsDescription.text=article.description
// load image using glide
        Glide
            .with(context)
            .load(article.urlToImage)
            .placeholder(R.drawable.progress_animation)
            .error(R.drawable.try_later)
            .into(holder.newsImage)

    }

    override fun getItemCount(): Int {
        return articles.size
    }
}