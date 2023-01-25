package com.example.android.kotlinretrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context, val userList: List<MyDataItem>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var gravatar_id: TextView
        var avatar_url: ImageView
        var events_url: TextView
        var followers_url: TextView
        var following_url: TextView
        var gists_url: TextView
        var html_url: TextView
        var id: TextView
        var login: TextView
        var node_id: TextView
        var organizations_url: TextView
        var received_events_url: TextView
        var repos_url: TextView
        var site_admin: TextView
        var starred_url: TextView
        var subscriptions_url: TextView
        var type: TextView
        var url: TextView

        init {

            gravatar_id = itemView.findViewById(R.id.gravatar_id)
            avatar_url = itemView.findViewById(R.id.avatar_url)
            events_url = itemView.findViewById(R.id.events_url)
            followers_url = itemView.findViewById(R.id.followers_url)
            following_url = itemView.findViewById(R.id.following_url)
            gists_url = itemView.findViewById(R.id.gists_url)
            html_url = itemView.findViewById(R.id.html_url)
            id = itemView.findViewById(R.id.id)
            login = itemView.findViewById(R.id.login)
            node_id = itemView.findViewById(R.id.node_id)
            organizations_url = itemView.findViewById(R.id.organizations_url)
            received_events_url = itemView.findViewById(R.id.received_events_url)
            repos_url = itemView.findViewById(R.id.repos_url)
            site_admin = itemView.findViewById(R.id.site_admin)
            starred_url = itemView.findViewById(R.id.starred_url)
            subscriptions_url = itemView.findViewById(R.id.subscriptions_url)
            type = itemView.findViewById(R.id.type)
            url = itemView.findViewById(R.id.url)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.gravatar_id---------------yet to impliment----------------
//        holder.avatar_url = userList[position].avatar_url.toString()
        holder.events_url.text = userList[position].events_url.toString()
        holder.followers_url.text = userList[position].followers_url.toString()
        holder.following_url.text = userList[position].following_url.toString()
        holder.gists_url.text = userList[position].gists_url.toString()
        holder.html_url.text = userList[position].html_url.toString()
        holder.id.text = userList[position].id.toString()
        holder.login.text = userList[position].login.toString()
        holder.node_id.text = userList[position].node_id.toString()
        holder.organizations_url.text = userList[position].organizations_url.toString()
        holder.received_events_url.text = userList[position].received_events_url.toString()
        holder.repos_url.text = userList[position].repos_url.toString()
        holder.site_admin.text = userList[position].site_admin.toString()
        holder.subscriptions_url.text = userList[position].subscriptions_url.toString()
        holder.type.text = userList[position].type.toString()
        holder.url.text = userList[position].url.toString()

    }

    override fun getItemCount(): Int {
        return userList.size
    }
}