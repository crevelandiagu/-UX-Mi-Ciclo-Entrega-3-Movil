package com.vynils.myapplication
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class home_fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_fragment)
        title = "Home"
        val button:Button = findViewById(R.id.iniciar)
        button.setOnClickListener {
            val intent = Intent(this@home_fragment, vista_alarmas::class.java)
            startActivity(intent)
        }
    }
}