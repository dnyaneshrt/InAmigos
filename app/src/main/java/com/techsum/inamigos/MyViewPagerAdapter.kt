package com.techsum.inamigos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class MyViewPagerAdapter(var cx: Context) : PagerAdapter() {
    var layoutInflater: LayoutInflater? = null
    override fun getCount(): Int {
        return MainActivity.Companion.layouts.size
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = cx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = layoutInflater!!.inflate(MainActivity.Companion.layouts.get(position), container, false)
        container.addView(view)
        return view
    }
    override fun isViewFromObject(view: View, o: Any): Boolean {
        return view === o
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)
    }
}