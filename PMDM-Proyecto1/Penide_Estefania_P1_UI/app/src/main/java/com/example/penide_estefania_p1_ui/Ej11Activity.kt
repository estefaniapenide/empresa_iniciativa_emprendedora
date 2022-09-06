package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_estefania_p1_ui.databinding.ActivityEj11Binding

class Ej11Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj11Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bInicio.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}