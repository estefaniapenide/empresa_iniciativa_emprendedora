package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_estefania_p1_ui.databinding.ActivityEj112Binding

class Ej11Activity_2 : AppCompatActivity() {
    private lateinit var binding:ActivityEj112Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj112Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener{startActivity(Intent(this,MainActivity::class.java))}
    }
}