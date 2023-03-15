package com.vynils.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class alarma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarma)

        val button: Button = findViewById(R.id.posponer)
        button.setOnClickListener {
            val intent = Intent(this, vista_alarmas::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.finalizar)
        button1.setOnClickListener {
            val intent = Intent(this, vista_alarmas::class.java)
            startActivity(intent)
        }

    }
}