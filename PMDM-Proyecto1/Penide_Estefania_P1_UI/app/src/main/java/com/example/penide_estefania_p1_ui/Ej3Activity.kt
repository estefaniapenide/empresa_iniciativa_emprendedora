package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.penide_estefania_p1_ui.databinding.ActivityEj2Binding
import com.example.penide_estefania_p1_ui.databinding.ActivityEj3Binding

class Ej3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEj3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button11.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }

    }
}