package com.example.androidkotlinapp_desty

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidkotlinapp_desty.R.id.main

class MainActivity : AppCompatActivity() {

    // Inisialisasi variabel counter
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Set padding untuk system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set nilai awal tvCounter
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        tvCounter.text = counter.toString()
    }

    // Fungsi untuk menambah angka
    fun addNumber(view: View) {
        counter++
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        tvCounter.text = counter.toString()
    }

    // Fungsi untuk mengurangi angka
    fun subtractNumber(view: View) {
        counter--
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        tvCounter.text = counter.toString()
    }

    // Fungsi untuk reset angka ke 0
    fun resetNumber(view: View) {
        counter = 0
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        tvCounter.text = counter.toString()
    }
}
