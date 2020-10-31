package com.techsum.inamigos.ui.collection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.techsum.inamigos.R

class CollectionFragmet: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var inflater=LayoutInflater.from(context)
        var view=inflater.inflate(R.layout.collection_fragment,container,false)
        return view
    }
}