package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoreReview : AppCompatActivity() {

    lateinit var back : ImageView
    lateinit var  write: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.more_review)

        back = findViewById(R.id.back)
        write= findViewById(R.id.btnWritereview)

        back.setOnClickListener(){
            goToProductDetail()
        }

        write.setOnClickListener(){
            goToWriteReview()
        }
    }

    fun goToProductDetail() {
        Intent(this, ProductDetail::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun goToWriteReview() {
        Intent(this,WriteReview::class.java).also {
            startActivity(it)
            finish()
        }
    }
}