package com.example.labb1_fourth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class LoggedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val textOfUser: String = intent.getStringExtra("key_username").toString()

        val userValue:TextView = findViewById(R.id.previosValue)
        userValue.text = textOfUser
        // This is supposed to recognise  userValue.text = writtenDown.text

        val oneStepBack: Button = findViewById(R.id.goingBackOne)

        val towardsText: Button = findViewById(R.id.goingToText)


        val aheadToText = Intent(this, MoretextActivity::class.java)
        val backToThird = Intent(this, SignInActivity::class.java)

        oneStepBack.setOnClickListener{
            println("This Lost Bird never learned to Fly appaerently")
            startActivity(backToThird)
        }

        towardsText.setOnClickListener{
         startActivity(aheadToText)
        }

    }
}