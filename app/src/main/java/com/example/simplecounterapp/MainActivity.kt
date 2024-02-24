package com.example.simplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val upgrdeBtn = findViewById<Button>(R.id.upgradeBtn)



        button.setOnClickListener{
            counter++
            textView.text = counter.toString()

            if(counter >= 10){
                upgrdeBtn.visibility = View.VISIBLE

                upgrdeBtn.setOnClickListener {
                    button.setOnClickListener {
                        counter += 2
                        textView.text = counter.toString()
                    }
                    upgrdeBtn.visibility = View.INVISIBLE
                }


            }
        }
    }
}