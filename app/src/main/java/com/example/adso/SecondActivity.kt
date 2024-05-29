package com.example.adso



import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val showMessageButton: Button = findViewById(R.id.button_show_message_second)
        showMessageButton.setOnClickListener {
            Toast.makeText(this, "Aquí en la segunda pantalla, pero mostrando un mensaje", Toast.LENGTH_SHORT).show()
        }
    }
}
