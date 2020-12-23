package com.techsum.inamigos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    var btn1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btn1 = findViewById(R.id.click_button)

        btn1?.setOnClickListener {

            Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
            val intent = Intent(this@HomeActivity, MenWomenActivity::class.java)
            startActivity(intent)
        }
    }
}