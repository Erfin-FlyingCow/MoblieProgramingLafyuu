package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NotifFeed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.notif_feed)
        val back = findViewById<ImageView>(R.id.back)
         back.setOnClickListener(){
             goToNotif()
         }
    }

    public fun goToNotif(){
        Intent(this,Notification::class.java).also {
            startActivity(it)
            finish()
        }
    }
}