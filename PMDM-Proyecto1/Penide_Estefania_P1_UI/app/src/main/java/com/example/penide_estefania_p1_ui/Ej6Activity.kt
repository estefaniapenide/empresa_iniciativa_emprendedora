package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.penide_estefania_p1_ui.databinding.ActivityEj5Binding
import com.example.penide_estefania_p1_ui.databinding.ActivityEj6Binding

class Ej6Activity : AppCompatActivity() {
    private lateinit var binding:ActivityEj6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj6Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}