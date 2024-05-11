package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.nikeair_product_detail)
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