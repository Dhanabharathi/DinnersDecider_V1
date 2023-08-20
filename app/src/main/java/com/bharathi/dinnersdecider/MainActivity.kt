package com.bharathi.dinnersdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private val foodlist = arrayListOf("dosa","idly","briyani","chicken","mutton")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val selectedFoodText = findViewById<TextView>(R.id.selectedfoodText)
        val addFood = findViewById<TextView>(R.id.Addfood)
        val decideButton = findViewById<Button>(R.id.decideButton)
        val addfoodbutton = findViewById<Button>(R.id.addbutton)
        decideButton.setOnClickListener{

            val randomFood = Random.nextInt(foodlist.count())
            selectedFoodText.text=foodlist[randomFood]

        }

        addfoodbutton.setOnClickListener{
            val newfood = addFood.text.toString()
            foodlist.add(newfood)
            Toast.makeText(applicationContext,"New food added",Toast.LENGTH_SHORT).show()
        }
    }
}