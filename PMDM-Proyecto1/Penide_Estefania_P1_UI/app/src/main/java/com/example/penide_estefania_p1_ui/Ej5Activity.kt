package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.penide_estefania_p1_ui.databinding.ActivityEj4Binding
import com.example.penide_estefania_p1_ui.databinding.ActivityEj5Binding

class Ej5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEj5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button13.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
    }
}