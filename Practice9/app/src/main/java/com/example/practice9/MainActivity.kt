    package com.example.practice9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text3: TextView = findViewById(R.id.textView3)
        text3.setText("Copyright (C) 2021")
    }
}