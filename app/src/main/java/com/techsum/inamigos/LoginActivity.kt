package com.techsum.inamigos

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    var loginbtn: Button? = null
    var signin_btn: Button? = null
    var fb: ImageView? = null
    var google: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()
        loginbtn = findViewById(R.id.login_button)
        signin_btn = findViewById(R.id.button_signin)
        fb = findViewById(R.id.fb_button)
        google = findViewById(R.id.google_button)
        Toast.makeText(this, "click on login ", Toast.LENGTH_SHORT).show()
        loginbtn!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
        })
        fb!!.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                this@LoginActivity,
                "facebook clicked ",
                Toast.LENGTH_SHORT
            ).show()
        })
        google!!.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                this@LoginActivity,
                "google clicked ",
                Toast.LENGTH_SHORT
            ).show()
        })
    }
}