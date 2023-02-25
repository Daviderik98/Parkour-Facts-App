package com.example.labb1_fourth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
import android.net.eap.EapSessionConfig.EapMsChapV2Config

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val fromSignToAbout: Button = findViewById(R.id.toSecondAbout)
        val minePass : EditText = findViewById(R.id.writePassword)

        val writtenDown: TextView = findViewById(R.id.textViewFive)
        val subMission: Button = findViewById(R.id.buttonToLoggedIn)

        subMission.setOnClickListener{
            writtenDown.text = minePass.text.toString()
        }

        val userList:Array<String> = arrayOf("David.erik", "daniel-san", "Eric.helsing", "Wictor.kaskov")

        val rightAnswer: Button = findViewById(R.id.buttonToFourth)
//Moving Forward, Conditional Next Activity

        val gotError = Intent(this, ErrorActivity::class.java)

        rightAnswer.setOnClickListener{
            var count:Int = 0
            var userName: String = ""
            for(item in 0.. (userList.size - 1))
                if(writtenDown.text == userList[item]){
                    userName = userList[item]
                    count = 1
                }

            if(count == 1){
                println("Welcome $userName")

                val goAhead = Intent(this, LoggedInActivity::class.java).apply{
                    putExtra("key_username", userName.toString())
                }
                startActivity(goAhead)
            }
            else {
            startActivity(gotError)
            }



            //Checking what the String contains


            //if(writtenDown.text == "Master"){
              //  val master = writtenDown.text
                //println("Yes the password was $master")
                //startActivity(goAhead)
            //}
            //else{
              //  startActivity(gotError)
            //}
        }




//Moving Back
        val backToAbout = Intent(this, AboutActivity::class.java)
        fromSignToAbout.setOnClickListener{
            println("Insert name here has uncovered the global pandemic plans")
            startActivity(backToAbout)
        }






        }
    }
