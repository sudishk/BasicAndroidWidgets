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

        val submitNowButton =
            findViewById<Button>(R.id.submitNowButton) // connecting clickMeButton to clickMeButton variable to performing click event
        val submittedText =
            findViewById<TextView>(R.id.submittedText) // connecting clickMeText to clickMeText variable to performing click event
        val nameEditText =
            findViewById<TextView>(R.id.enterNameEditText) // connecting clickMeText to clickMeText variable to performing click event

        /*
          val nameText = nameEditText.text //text getting

          Toast.makeText(this, "$nameText", Toast.LENGTH_SHORT).show()

          nameEditText.setText("Hello text is inserted") //text setting
          val nameText1 = nameEditText.text //text getting
        */

        submitNowButton.setOnClickListener { // adding click event
            val nameText = nameEditText.text //text gettingf

            Toast.makeText(this, "$nameText", Toast.LENGTH_SHORT).show()

            submittedText.text = nameText //setting text
        }
    }
}