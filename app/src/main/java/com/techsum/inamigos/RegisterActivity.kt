package com.techsum.inamigos


import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    var fb: ImageView? = null
    var google: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar!!.hide()
        fb = findViewById(R.id.fb_button)
        google = findViewById(R.id.google_button)
        Toast.makeText(this, "buttons will be implemented soon..", Toast.LENGTH_SHORT).show()
        fb!!.setOnClickListener(View.OnClickListener { Toast.makeText(this@RegisterActivity, "facebook clicked ", Toast.LENGTH_SHORT).show() })
        google!!.setOnClickListener(View.OnClickListener { Toast.makeText(this@RegisterActivity, "google clicked ", Toast.LENGTH_SHORT).show() })
    }
}