package com.techsum.inamigos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ToggleButton
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButtonToggleGroup
import com.squareup.picasso.Picasso
import com.techsum.inamigos.R
import com.techsum.inamigos.model.VoteForDesignItemX

class VoteForDesignAdapter(val voteForDesignList : ArrayList<VoteForDesignItemX>, val context: Context) : RecyclerView.Adapter<VoteForDesignAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.vote_for_design_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return voteForDesignList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivVote.setImageDrawable(context.resources.getDrawable(R.drawable.fanbook))
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivVote = itemView.findViewById(R.id.ivVote) as ImageView
        val tbVote = itemView.findViewById(R.id.tbVote) as ToggleButton
    }
}