package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.notification)

        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener() {
            toHomeScreen()
        }

        val offer = findViewById<ImageView>(R.id.offer)
        offer.setOnClickListener() {
            toOffer()
        }

        val feed = findViewById<ImageView>(R.id.feed)
        feed.setOnClickListener() {
            toFeed()
        }

        val activity = findViewById<ImageView>(R.id.activity)
        activity.setOnClickListener() {
            toActivity()
        }
    }


    fun toHomeScreen() {
        Intent(this, Home::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun toOffer(){
        Intent(this, NotificationOffer::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun toFeed(){
        Intent(this, NotifFeed::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun toActivity(){
        Intent(this, NotifActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}