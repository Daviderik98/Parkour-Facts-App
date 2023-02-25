package com.example.labb1_fourth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MoretextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moretext)

        val forFinal: Button = findViewById(R.id.toFinalScreen)
        val finalIntent = Intent(this, MainActivity::class.java)

        forFinal.setOnClickListener{
            startActivity(finalIntent)
        }
    }
}