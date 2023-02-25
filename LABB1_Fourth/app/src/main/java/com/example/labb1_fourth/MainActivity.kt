package com.example.labb1_fourth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton: Button = findViewById(R.id.mainOne)
        val fromMainToAbout = Intent(this, AboutActivity::class.java)

        firstButton.setOnClickListener{
            println("Initiating screen 2")
            startActivity(fromMainToAbout)
        }
    }
}