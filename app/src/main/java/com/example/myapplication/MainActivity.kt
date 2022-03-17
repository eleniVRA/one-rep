package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /**
     * This method is called when the Activity is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button
                                = findViewById(R.id.button)

        rollButton.setOnClickListener {
           val toast = Toast.makeText(this, "Dice rolled", Toast.LENGTH_LONG)
           toast.show()
        }
    }
}