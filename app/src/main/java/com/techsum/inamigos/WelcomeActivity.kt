package com.techsum.inamigos

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    var btn1: Button? = null
    var btn2: Button? = null
    var btn3: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        supportActionBar!!.hide()

        btn1 = findViewById(R.id.button_signin)
        btn2 = findViewById(R.id.button_signup)
        btn3 = findViewById(R.id.skip_button)

        btn2!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@WelcomeActivity, RegisterActivity::class.java)
            startActivity(intent)
        })
        btn1!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@WelcomeActivity, LoginActivity::class.java)
            startActivity(intent)
        })

        btn3!!.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}