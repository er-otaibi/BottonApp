package com.example.helloworld

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var counter: TextView
    lateinit var minus: Button
    lateinit var add: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = findViewById(R.id.counter)
        minus = findViewById(R.id.minus)
        add = findViewById(R.id.add)


          add.setOnClickListener{ increaseInteger()}
          minus.setOnClickListener{ decreaseInteger()}
    }


     fun increaseInteger() {
    display(counter.text.toString().toInt() + 1)
     }

    fun decreaseInteger() {
        display(counter.text.toString().toInt() - 1)
    }
    private fun display(number: Int) {
        counter.setText("$number")
    }

}