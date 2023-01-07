package com.example.android.cardview

import android.content.Context
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class rcvAdapter(val requiredContext: Context,private val phonedetails: ArrayList<phonedetailsclass>) :RecyclerView.Adapter<rcvAdapter.phoneDetailsViewHolder>(){

class phoneDetailsViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val personName1:TextView=itemView.findViewById((R.id.item_txt1))
        val phoneNumber2:TextView=itemView.findViewById((R.id.item_txt2))

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): phoneDetailsViewHolder {
      val view=LayoutInflater.from(parent.context).inflate(R.layout.rcv_items_layoutof_repeated_items,parent,false)
        return phoneDetailsViewHolder(view)
    }

    override fun onBindViewHolder(holder: phoneDetailsViewHolder, position: Int) {

        holder.personName1.text=phonedetails[position].personName
        holder.phoneNumber2.text=phonedetails[position].personNumber

    }

    override fun getItemCount(): Int {
        return phonedetails.size
    }
}

