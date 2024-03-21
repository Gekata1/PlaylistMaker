package com.example.playlistmaker

import android.annotation.SuppressLint
import android.content.Intent
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
        button1.setOnClickListener {
            val button1Intent = Intent(this, SearchActivity::class.java)
            startActivity(button1Intent)
        }
        val button2 = findViewById<Button>(R.id.button_media)
        button2.setOnClickListener {
            val button2Intent = Intent(this, MediaActivity::class.java)
            startActivity(button2Intent)
        }
        val button3 = findViewById<Button>(R.id.button_settings)
        button3.setOnClickListener {
            val button3Intent = Intent(this, SettingsActivity::class.java)
            startActivity(button3Intent)
        }
    }

}









