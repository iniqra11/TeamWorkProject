package com.example.teamworks.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.teamworks.R
import com.example.teamworks.model.MyItemData

class MyItemAdapter(val itemsList : ArrayList<MyItemData>) : RecyclerView.Adapter<MyItemAdapter.MyItemViewHolder>() {

    class MyItemViewHolder(view : View) : RecyclerView.ViewHolder(view)
    {
           val companyLogoImageView : ImageView = view.findViewById(R.id.item_company_logo)
        val itemIdTextView :TextView = view.findViewById(R.id.item_id)
        val itemTitleTextView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_images_item_layout,parent,false)
        return MyItemViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 3
    }

    override fun onBindViewHolder(holder: MyItemViewHolder, position: Int) {
        val itemData = itemsList[position]
        holder.companyLogoImageView.setImageResource(itemData.imageResourceId)
        holder.itemIdTextView.text = "ID : ${itemData.itemId}"
        holder.itemTitleTextView.text = "TITLE : ${itemData.itemTitle}"
    }
}