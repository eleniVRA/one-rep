package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /**
     * This method is called when the Activity is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
//οριζω το κουμπί
            val myFirstButton : Button = findViewById(R.id.button)
//λειτουργικοτητα ρήψης
            fun rollDice(){
                //δημιουργια ενος ζαριου
                val firstDice = Dice(5)
                //δημιουργία ρίψης
                val diceRoll = firstDice.roll()
                //ΟΡΙΣΜΟΣ ΚΕΙΜΕΝΟΥ
                val resulTextViewMine : TextView = findViewById(R.id.textView)
                //ΟΡΙΣΜΟΣ ΚΕΙΜΕΝΟ
                resulTextViewMine.text= diceRoll.toString()
                //ΟΡΙΣΜΟΣ ΦΩΤΟ
                val resultDiceView: ImageView = findViewById(R.id.imageView)
                val drawableResult =  when (diceRoll){
                    1-> R.drawable.dice_1
                    2-> R.drawable.dice_2
                    3-> R.drawable.dice_3
                    4-> R.drawable.dice_4
                    5-> R.drawable.dice_5
                    //xoris else vgazei lathos
                    else-> R.drawable.dice_6

                }

                resultDiceView.setImageResource(drawableResult)
            }

//στο πατημα του κουμπιου πραγματοποιω τη ρηψη
            myFirstButton.setOnClickListener {
                val toastmsg = Toast.makeText(this, "hello there" , Toast.LENGTH_LONG)
                toastmsg.show()
                rollDice()
            }
//when start
            rollDice()
        }
    }

class Dice(val numSides: Int){
            fun roll():Int {
                    return (1..numSides).random()
    }
}
