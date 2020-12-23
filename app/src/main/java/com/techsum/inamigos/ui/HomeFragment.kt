package com.techsum.inamigos.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android4dev.recyclerview.recyclerview_helper.GridItemDecoration
import com.techsum.inamigos.photoeditor.BaseActivity
import com.techsum.inamigos.R
import com.techsum.inamigos.adapter.HomeScreenAdapter
import com.techsum.inamigos.model.HomeScreenItem

class HomeFragment : Fragment(), HomeScreenAdapter.OnItemClick {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var rvHome: RecyclerView
    var btn: Button? = null

    private lateinit var homeScreenAdapter: HomeScreenAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        rvHome = root.findViewById(R.id.rvHome)
        btn = root.findViewById(R.id.click_home_button);

        var homeItemsList = ArrayList<HomeScreenItem>()
        homeItemsList.add(HomeScreenItem("1", ""))
        homeItemsList.add(HomeScreenItem("2", ""))
        homeItemsList.add(HomeScreenItem("3", ""))
        homeItemsList.add(HomeScreenItem("4", ""))
        homeItemsList.add(HomeScreenItem("5", ""))
        homeItemsList.add(HomeScreenItem("6", ""))
        homeItemsList.add(HomeScreenItem("7", ""))
        homeItemsList.add(HomeScreenItem("8", ""))
        homeItemsList.add(HomeScreenItem("9", ""))
        homeItemsList.add(HomeScreenItem("10", ""))
        homeItemsList.add(HomeScreenItem("11", ""))
        homeItemsList.add(HomeScreenItem("12", ""))
        homeItemsList.add(HomeScreenItem("13", ""))
        homeItemsList.add(HomeScreenItem("14", ""))
        homeItemsList.add(HomeScreenItem("15", ""))
        homeItemsList.add(HomeScreenItem("16", ""))
        homeItemsList.add(HomeScreenItem("17", ""))
        homeItemsList.add(HomeScreenItem("18", ""))
        homeItemsList.add(HomeScreenItem("19", ""))
        homeItemsList.add(HomeScreenItem("20", ""))

        rvHome.layoutManager = GridLayoutManager(requireContext(), 2)
        rvHome.addItemDecoration(GridItemDecoration(10, 2))
        homeScreenAdapter = HomeScreenAdapter(requireContext(), homeItemsList, this)
        rvHome.adapter = homeScreenAdapter



        return root
    }

    override fun OnItemClicked(position: Int) {
        Toast.makeText(activity, "item clicked 345", Toast.LENGTH_LONG).show();


//calling opengallery logic
//Test().test()


        val intent = Intent(requireContext(), ItemsDetailsActivity::class.java)
        startActivity(intent)
    }
}

class Test: BaseActivity()
{
    fun test()
    {
        Test().openGallery()
    }
}