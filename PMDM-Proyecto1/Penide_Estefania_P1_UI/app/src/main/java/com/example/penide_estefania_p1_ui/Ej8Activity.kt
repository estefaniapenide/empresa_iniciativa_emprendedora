package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.penide_estefania_p1_ui.databinding.ActivityEj7Binding
import com.example.penide_estefania_p1_ui.databinding.ActivityEj8Binding

class Ej8Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEj8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj8Binding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.button17.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
    }
}