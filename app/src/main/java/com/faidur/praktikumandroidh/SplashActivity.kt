package com.faidur.praktikumandroidh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        getSupportActionBar()?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val sharedPreferences = this.getSharedPreferences("MY_SP", MODE_PRIVATE)

            val usernameSharedPreferences = sharedPreferences.getString("username","")
            val passwordSharedPreferences = sharedPreferences.getString("password","")

            if(usernameSharedPreferences == "" || passwordSharedPreferences == ""){
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }, 2000)
    }
}