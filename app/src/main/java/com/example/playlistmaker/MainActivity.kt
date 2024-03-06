package com.example.playlistmaker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button_search)
        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "ПОИСК", Toast.LENGTH_SHORT).show()
            }
        })
        val button2 = findViewById<Button>(R.id.button_media)
        button2.setOnClickListener {
            Toast.makeText(this@MainActivity, "МЕДИА", Toast.LENGTH_SHORT).show()
        }
        val button3 = findViewById<Button>(R.id.button_settings)
        button3.setOnClickListener {
            Toast.makeText(this@MainActivity, "НАСТРОЙКИ", Toast.LENGTH_SHORT).show()
        }
    }
}






