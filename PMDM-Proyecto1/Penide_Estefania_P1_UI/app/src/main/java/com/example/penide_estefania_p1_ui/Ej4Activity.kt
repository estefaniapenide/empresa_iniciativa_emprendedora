package com.example.penide_estefania_p1_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.layout
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.penide_estefania_p1_ui.databinding.ActivityEj3Binding
import com.example.penide_estefania_p1_ui.databinding.ActivityEj4Binding


class Ej4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEj4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView14.setOnClickListener{
            Toast.makeText(this@Ej4Activity,"SÍ", Toast.LENGTH_SHORT).show()
        }

        binding.textView15.setOnClickListener{
            Toast.makeText(this@Ej4Activity,"NO", Toast.LENGTH_SHORT).show()
        }

        binding.textView16.setOnClickListener{
            Toast.makeText(this@Ej4Activity,"A VECES", Toast.LENGTH_SHORT).show()
        }


        binding.button12.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
    }
}