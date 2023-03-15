package com.vynils.myapplication
import android.widget.Button
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        val button: Button = findViewById(R.id.test2)
        button.setOnClickListener {
            val intent = Intent(this, vista_alarmas::class.java)
            startActivity(intent)
        }
    }
}