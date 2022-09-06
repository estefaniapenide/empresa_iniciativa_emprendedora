package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.penide_estefania_p1_ui.databinding.ActivityEj6Binding
import com.example.penide_estefania_p1_ui.databinding.ActivityEj7Binding

class Ej7Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEj7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button15.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
    }
}