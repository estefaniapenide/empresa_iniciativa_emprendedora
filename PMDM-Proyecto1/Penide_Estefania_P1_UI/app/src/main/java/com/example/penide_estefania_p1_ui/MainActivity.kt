package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_estefania_p1_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.b1.setOnClickListener{
            val intent = Intent(
                this,
                Ej1Activity::class.java
            )
            startActivity(intent)
        }

        binding.b2.setOnClickListener{
            val intent = Intent(
                this,
                Ej2Activity::class.java
            )
            startActivity(intent)
        }

        binding.b3.setOnClickListener{
            val intent = Intent(
                this,
                Ej3Activity::class.java
            )
            startActivity(intent)
        }

        binding.b4.setOnClickListener{
            val intent = Intent(
                this,
                Ej4Activity::class.java
            )
            startActivity(intent)
        }

        binding.b5.setOnClickListener{
            val intent = Intent(
                this,
                Ej5Activity::class.java
            )
            startActivity(intent)
        }

        binding.b6.setOnClickListener{
            val intent = Intent(
                this,
                Ej6Activity::class.java
            )
            startActivity(intent)
        }

        binding.b7.setOnClickListener{
            val intent = Intent(
                this,
                Ej7Activity::class.java
            )
            startActivity(intent)
        }

        binding.b8.setOnClickListener{
            val intent = Intent(
                this,
                Ej8Activity::class.java
            )
            startActivity(intent)
        }

        binding.b9.setOnClickListener{
            val intent = Intent(
                this,
                Ej9Activity::class.java
            )
            startActivity(intent)
        }

        binding.b10.setOnClickListener{
            val intent = Intent(
                this,
                Ej10Activity::class.java
            )
            startActivity(intent)
        }

        binding.b11.setOnClickListener{
            //val intent = Intent(this, Ej11Activity::class.java)
            startActivity(Intent(this, Ej11Activity::class.java))
        }

        binding.b112.setOnClickListener{startActivity(Intent(this,Ej11Activity_2::class.java))}

        binding.b12.setOnClickListener{startActivity(Intent(this,Ej12Activity::class.java))}
    }
}