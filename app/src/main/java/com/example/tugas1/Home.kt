package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home)

        val flashSale = findViewById<ImageView>(R.id.superFlasesale)
        flashSale.setOnClickListener(){
        goToOffer()
        }

        val btnfavorite = findViewById<ImageView>(R.id.bfavorite)
        btnfavorite.setOnClickListener(){
            goToFavorite()
        }

        val nikeairbtn = findViewById<ImageView>(R.id.nikeairproduct)
        nikeairbtn.setOnClickListener(){
            goToDetailNikeAir()
        }

        val notif = findViewById<ImageView>(R.id.notif)
        notif.setOnClickListener(){
            goToNotif()
        }

        val explore = findViewById<ImageView>(R.id.explore)
        explore.setOnClickListener(){
            goToExplore()
        }


    }




    fun goToOffer() {
        Intent(this,Offer::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun goToFavorite(){
        Intent(this,Favorite::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun goToDetailNikeAir(){
        Intent(this,ProductDetail::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun goToNotif(){
        Intent(this,Notification::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun goToExplore(){
        Intent(this, Explore::class.java).also {
            startActivity(it)
            finish()
        }
    }

}