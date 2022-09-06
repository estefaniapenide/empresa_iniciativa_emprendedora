package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.penide_estefania_p1_ui.databinding.ActivityEj10Binding

class Ej10Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj10Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button23.setOnClickListener{
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }

        binding.button22.setOnClickListener{
            if(binding.editTextTextPersonName.text.isEmpty()){
                Toast.makeText(this,"Debe introducir un nombre de usuario",Toast.LENGTH_SHORT).show()
            }else if(binding.editTextTextPassword.text.isEmpty()){
                Toast.makeText(this,"Debe introducir una contraseña",Toast.LENGTH_SHORT).show()
            }else if(binding.editTextTextPassword.text.length<8){
                Toast.makeText(this,"La contraseña debe tener al menos 8 caracteres",Toast.LENGTH_SHORT).show()
            }
        }
    }
}