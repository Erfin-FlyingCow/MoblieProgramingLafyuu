package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val register = findViewById<TextView>(R.id.register)
        register.setOnClickListener(){
            toRegisterScreen()
        }

        val signIn = findViewById<Button>(R.id.btn_signIn)
        signIn.setOnClickListener(){
            toHomeScreen()
        }

    }

    fun toRegisterScreen() {
        Intent(this,RegisterScreen::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun toHomeScreen() {
        Intent(this,Home::class.java).also {
            startActivity(it)
            finish()
        }
    }
}