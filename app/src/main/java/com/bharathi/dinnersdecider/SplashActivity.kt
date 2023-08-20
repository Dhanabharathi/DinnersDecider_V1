package com.bharathi.dinnersdecider

import android.os.Bundle
import android.os.Looper
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class SplashActivity : AppCompatActivity() {

    val splashTimeout: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, splashTimeout)
    }

}