package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //private lateinit var tv: TextView

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.rollbtn)
           // tv = findViewById(R.id.tv)
        imageView = findViewById(R.id.imageView)
        // we can also find textview same like above however we can also use another way like this   private lateinit var tv: TextView
        //lateinit means we will incialize this after.

        btn.setOnClickListener { rollDice()}

    }
    private fun rollDice(){
    val randomNumbr = (1..6).random()

        //tv.text = randomNumbr.toString()

        //however in java we used to use tv.TextView on the otherhand kotlin given us tv.text option

        // Kotlin has given when statement while in other language like java there is switch case we use.
      val drawableImage =
          when(randomNumbr) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4-> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

            // there is good thing in kotlin that we can store when statement things in a variable
        }
        // then whatever the return we will received in deawableImage variable then we will set it into imageview

        imageView.setImageResource(drawableImage)

    }
}