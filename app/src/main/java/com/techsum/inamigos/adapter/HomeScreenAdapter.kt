package com.techsum.inamigos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.techsum.inamigos.R
import com.techsum.inamigos.model.HomeScreenItem

class HomeScreenAdapter(val context: Context, val homeList : ArrayList<HomeScreenItem>, val itemClickListener : HomeScreenAdapter.OnItemClick) : RecyclerView.Adapter<HomeScreenAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.home_screen_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return homeList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cvItem.setOnClickListener{
            itemClickListener.OnItemClicked(position)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cvItem = itemView.findViewById(R.id.cvTshirt) as MaterialCardView
    }

    interface OnItemClick{
        fun OnItemClicked(position : Int)
    }
}