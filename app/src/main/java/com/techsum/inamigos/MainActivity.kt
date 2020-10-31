package com.techsum.inamigos

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener

class MainActivity : AppCompatActivity() {
    private var viewPager: ViewPager? = null
    private var myViewPagerAdapter: MyViewPagerAdapter? = null
    private var dotsLayout: LinearLayout? = null
    private lateinit var dots: Array<TextView?>
    private var btnSkip: Button? = null
    private var btnNext: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        if (Build.VERSION.SDK_INT >= 21) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        chnageBarColour()
        viewPager = findViewById<View>(R.id.view_pager) as ViewPager
        dotsLayout = findViewById<View>(R.id.layoutDots) as LinearLayout
        btnSkip = findViewById<View>(R.id.btn_skip) as Button
        btnNext = findViewById<View>(R.id.btn_next) as Button
        btnNext!!.setOnClickListener {
            val current = viewPager!!.currentItem + 1
            Log.d("btncheck", current.toString() + " " + layouts.size)
            if (current < layouts.size) {
                viewPager!!.currentItem = current
            } else {
                val intent = Intent(this@MainActivity, WelcomeActivity::class.java)
                startActivity(intent)
            }
        }
        btnSkip!!.setOnClickListener {
            val intent = Intent(this@MainActivity, WelcomeActivity::class.java)
            startActivity(intent)
        }
        layouts = intArrayOf(
            R.layout.screen1,
            R.layout.screen2,
            R.layout.screen3,
            R.layout.screen4,
            R.layout.screen5
        )
        addbtn(0)
        myViewPagerAdapter = MyViewPagerAdapter(this@MainActivity)
        viewPager!!.adapter = myViewPagerAdapter
        viewPager!!.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(i: Int, v: Float, i1: Int) {}
            override fun onPageSelected(position: Int) {
                addbtn(position)
                if (position == layouts.size - 1) {
                    btnNext!!.text = "Start"
                    btnSkip!!.visibility = View.GONE
                } else {
                    btnNext!!.text = "Next"
                    btnSkip!!.visibility = View.VISIBLE
                }
            }

            override fun onPageScrollStateChanged(i: Int) {}
        })
    }

    private fun chnageBarColour() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    fun addbtn(currentPage: Int) {
        dots = arrayOfNulls(layouts.size)
        val colorsActive = resources.getIntArray(R.array.array_dot_active)
        val colorsInactive = resources.getIntArray(R.array.array_dot_inactive)
        dotsLayout!!.removeAllViews()
        for (i in dots.indices) {
            dots[i] = TextView(this)
            dots[i]!!.text = Html.fromHtml("&#8226;")
            dots[i]!!.textSize = 35f
            dots[i]!!.setTextColor(colorsInactive[currentPage])
            dotsLayout!!.addView(dots[i])
        }
        if (dots.size > 0) {
            dots[currentPage]!!.setTextColor(colorsActive[currentPage])
        }
    }

    companion object {
        lateinit var layouts: IntArray
    }
}