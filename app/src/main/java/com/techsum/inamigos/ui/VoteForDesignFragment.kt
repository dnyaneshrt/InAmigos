package com.techsum.inamigos.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.techsum.inamigos.R
import com.techsum.inamigos.adapter.VoteForDesignAdapter
import com.techsum.inamigos.model.VoteForDesignItemX

class VoteForDesignFragment : Fragment() {
    private lateinit var linearLayoutManager : LinearLayoutManager
    private lateinit var voteForDesignAdapter : VoteForDesignAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_vote_for_design, container, false)
        val rvVoteForDesign = root.findViewById(R.id.rvVoteForDesign) as RecyclerView
        val voteForDesignItemList = ArrayList<VoteForDesignItemX>()
        voteForDesignItemList.add(VoteForDesignItemX("1","https://images.unsplash.com/photo-1434873740857-1bc5653afda8?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=joshua-hibbert-Pn6iimgM-wo-unsplash.jpg"))
        linearLayoutManager = LinearLayoutManager(activity)
        rvVoteForDesign.layoutManager = linearLayoutManager
        voteForDesignAdapter = VoteForDesignAdapter(voteForDesignItemList, requireContext())
        rvVoteForDesign.adapter = voteForDesignAdapter
        return root
    }
}