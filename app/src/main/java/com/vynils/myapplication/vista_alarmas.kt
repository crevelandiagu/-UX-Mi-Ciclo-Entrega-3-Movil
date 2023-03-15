package com.vynils.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vista_alarmas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_alarmas)
        title = "Alarmas"
        val button: Button = findViewById(R.id.inicio)
        button.setOnClickListener {
            val intent = Intent(this, home_fragment::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.crear_alarma)
        button1.setOnClickListener {
            val intent = Intent(this, creacion_alarma::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.alarmar_activa)
        button2.setOnClickListener {
            val intent = Intent(this, alarma::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.configuracion)
        button3.setOnClickListener {
            val intent = Intent(this, configuracion::class.java)
            startActivity(intent)
        }
    }
}