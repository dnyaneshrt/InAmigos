package com.techsum.inamigos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenWomenActivity : AppCompatActivity() {
    var btn1: Button? = null
    var btn2: Button? = null
    var btn3: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men_women)

        btn1 = findViewById(R.id.men_button)
        btn2 = findViewById(R.id.women_button)
        btn3 = findViewById(R.id.next_image_button)

        supportActionBar!!.hide()

        var fManager = supportFragmentManager
        var tx = fManager.beginTransaction()
        tx.add(R.id.my_frame, MenFrag())
        tx.addToBackStack("true")
        tx.commit()

        btn1?.setOnClickListener {

            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame, MenFrag())
            tx.addToBackStack("true")
            tx.commit()
        }
        btn2?.setOnClickListener {

            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame, WomenFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        btn3?.setOnClickListener {
            val intent = Intent(this@MenWomenActivity, HomeScreenActivity::class.java)
            startActivity(intent)

        }
    }
}
