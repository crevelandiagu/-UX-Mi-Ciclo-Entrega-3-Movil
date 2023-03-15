package com.vynils.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.net.Uri;

class configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)
        title = "Configuracion"
        val button: Button = findViewById(R.id.cancelar)
        button.setOnClickListener {
            val intent = Intent(this, vista_alarmas::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.guardar)
        button1.setOnClickListener {
            val intent = Intent(this, vista_alarmas::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.leer_qr)
        button2.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.web_ciclo)
        button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://espanol.womenshealth.gov/menstrual-cycle"))
            startActivity(intent)
        }
    }
}