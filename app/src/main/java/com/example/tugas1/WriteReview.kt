package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.TintableBackgroundView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WriteReview : AppCompatActivity() {

    lateinit var back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.writereview)

        back = findViewById(R.id.back)

        back.setOnClickListener(){
            goreviewSeeMore()
        }

    }
    fun goreviewSeeMore(){
        Intent(this,MoreReview::class.java).also{
            startActivity(it)
            finish()
        }
    }
}