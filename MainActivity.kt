package com.example.interactiveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnintent=findViewById<Button>(R.id.button)
        btnintent.setOnClickListener {
            intent= Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}