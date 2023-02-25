package com.example.labb1_fourth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val toTheStart = Intent(this, MainActivity::class.java)
        val toTheThird = Intent(this, SignInActivity::class.java)

        val buttonBackTwo: Button = findViewById(R.id.backToOne)
        val buttonForwardTwo: Button = findViewById(R.id.towardsThree)

        buttonBackTwo.setOnClickListener{
            println("Master Yoda has survived Palpatines lightning")
            startActivity(toTheStart)
        }

        buttonForwardTwo.setOnClickListener{
            println("The Message of Archers voice mail is full so call back later")
            startActivity(toTheThird)
        }



    }
}