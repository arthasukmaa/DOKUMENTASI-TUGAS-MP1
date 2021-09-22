package com.arthasukma.instagramku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView9 = findViewById<TextView>(R.id.textView9)
        val btn_ikuti = findViewById<Button>(R.id.btn_ikuti)

        btn_ikuti.setOnClickListener {
            textView9.text = "817"
            btn_ikuti.text = "mengikuti"
        }
    }
}