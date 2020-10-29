package com.example.randomnumber

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        
    }

    @SuppressLint("SetTextI18n")
    private fun init() {
        val generateRandomNumberButton = findViewById<Button>(R.id.generator)
        val randomNumberTextView = findViewById<TextView>(R.id.randomNumberTextView)
        val answer: TextView = findViewById(R.id.answer)
        generateRandomNumberButton.setOnClickListener {
            val randomNumber = (-100..100).random()
            d("randomNumber", "The random number is: $randomNumber")
            randomNumberTextView.text = randomNumber.toString()
                if ((randomNumber % 5 == 0) and (randomNumber / 5 > 0)) {
                    answer.text = "yes"
                } else {
                    answer.text = "no"
                }
        }
    }
}



