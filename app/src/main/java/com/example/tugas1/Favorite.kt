package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Favorite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.favorites)
        val back= findViewById<ImageView>(R.id.backhome)
        back.setOnClickListener(){
            toHomeScreen()
        }
    }

    fun toHomeScreen() {
        Intent(this, Home::class.java).also {
            startActivity(it)
            finish()
        }
    }
}