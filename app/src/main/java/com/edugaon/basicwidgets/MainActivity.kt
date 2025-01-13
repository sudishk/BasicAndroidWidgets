package com.edugaon.basicwidgets

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val clickMeButton = findViewById<Button>(R.id.clickMeButton) // connecting clickMeButton to clickMeButton variable to performing click event
        val clickMeText = findViewById<TextView>(R.id.clickMeText) // connecting clickMeText to clickMeText variable to performing click event

        clickMeButton.setOnClickListener { // adding click event
            Toast.makeText(this, "You clicked on Button", Toast.LENGTH_SHORT).show() // showing short time message
        }

        clickMeText.setOnClickListener { // adding click event
            Toast.makeText(this, "You clicked on Text", Toast.LENGTH_SHORT).show() // showing short time message
        }
    }
}