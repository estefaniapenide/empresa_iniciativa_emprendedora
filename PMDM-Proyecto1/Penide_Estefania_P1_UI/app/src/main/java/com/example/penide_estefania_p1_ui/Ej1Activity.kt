package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.penide_estefania_p1_ui.databinding.ActivityEj1Binding

class Ej1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityEj1Binding.inflate(layoutInflater)
    setContentView(binding.root)

        binding.button9.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}