package com.techsum.inamigos

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys

class LoginActivity : AppCompatActivity() {
    var loginbtn: Button? = null
    var signin_btn: Button? = null
    var fb: ImageView? = null
    var google: ImageView? = null
    private var sharedPreferences: SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()
        val masterKeyAlias: String = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
        sharedPreferences = EncryptedSharedPreferences.create("APP_CONFIG",masterKeyAlias,this,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM)
        loginbtn = findViewById(R.id.user_login_button)
        signin_btn = findViewById(R.id.button_signin)
        fb = findViewById(R.id.fb_button)
        google = findViewById(R.id.google_button)
        loginbtn!!.setOnClickListener(View.OnClickListener {
            val editor = sharedPreferences!!.edit()
            editor.putString("isLoggedIn", "1")
            editor.apply()
            val intent = Intent(this@LoginActivity, HomeScreenActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
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