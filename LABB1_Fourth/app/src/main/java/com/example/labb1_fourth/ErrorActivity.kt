package com.example.labb1_fourth

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.content.Intent

class ErrorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)

        val backToFirst: ImageView = findViewById(R.id.imageToStart)
        val restartFromFirst = Intent(this, MainActivity::class.java)

        //Taking you back to Screen One
        backToFirst.setOnClickListener{
            startActivity(restartFromFirst)

        }
    }
}