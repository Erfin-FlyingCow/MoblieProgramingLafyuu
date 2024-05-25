package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoreReview : AppCompatActivity() {

    lateinit var back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.more_review)

        back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener(){
            goToProductDetail()
        }
    }

    fun goToProductDetail() {
        Intent(this, ProductDetail::class.java).also {
            startActivity(it)
            finish()
        }

    }
}