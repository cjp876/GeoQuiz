package com.purcell.msu.geoquizapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var trueButton : Button
    private lateinit var falseButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton.setOnClickListener{
            Toast.makeText(
                this,
                R.string.true_button,
                Toast.LENGTH_SHORT)
                .show()
        }

        falseButton.setOnClickListener{
            Toast.makeText(
                this,
                R.string.false_button,
                Toast.LENGTH_SHORT)
                .show()
        }
    }

}