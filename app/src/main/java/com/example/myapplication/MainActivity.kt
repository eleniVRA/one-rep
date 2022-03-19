package com.example.myapplication

import android.os.Bundle
import android.widget.Button
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
//METAVLITI
            val myFirstButton : Button = findViewById(R.id.button)
//FUNCTION
            fun rollDice(){
                //δημιουργια ενος ζαριου
                val firstDice = Dice(5)
                //δημιουργία ρίψης
                val diceRoll = firstDice.roll()
                //ΟΡΙΣΜΟΣ
                val resulTextViewMine : TextView = findViewById(R.id.textView)
                //ΟΡΙΣΜΟΣ ΚΕΙΜΕΝΟ
                resulTextViewMine.text= diceRoll.toString()
                    }

//PATIMA KOUMPIA
            myFirstButton.setOnClickListener {
                val toastmsg = Toast.makeText(this, "hello there" , Toast.LENGTH_LONG)
                toastmsg.show()
                rollDice()
            }
        }
    }

class Dice(val numSides: Int){     
            fun roll():Int {
                    return (1..numSides).random()
    }
}
