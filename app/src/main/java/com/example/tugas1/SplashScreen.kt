package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.splash)

        Handler(Looper.getMainLooper()).postDelayed({
        goToLoginScreen()
        }, 3000)
    }

    fun goToLoginScreen() {
        Intent(this,LoginScreen::class.java).also {
            startActivity(it)
            finish()
        }
    }
}