package com.example.circle_ci_template_application

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val imageCircleCi = findViewById<ImageView>(R.id.imageCircleCi)
        val textViewCircleCi = findViewById<TextView>(R.id.textViewCircleCi)

        linearLayout.setOnClickListener {
            var randomColor = "#"
            repeat(3) {
                var candidateColor = (0..255).random().toString(16)

                if (candidateColor.length == 1) candidateColor += "0"

                randomColor += candidateColor
            }

            textViewCircleCi.setTextColor(Color.parseColor(randomColor))
            imageCircleCi.setColorFilter(Color.parseColor(randomColor))
        }
    }
}