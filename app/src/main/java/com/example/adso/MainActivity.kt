package com.example.adso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showMessageButton = findViewById<Button>(R.id.button_show_message)
        showMessageButton.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Primer botón de mi app en android",
                Toast.LENGTH_SHORT
            ).show()
        }

        val openSecondActivityButton = findViewById<Button>(R.id.button_open_second_activity)
        openSecondActivityButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                SecondActivity::class.java
            )
            startActivity(intent)
        }
    }
}
