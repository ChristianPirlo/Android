package com.example.progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val btnSampleRV : Button = findViewById(R.id.btnSampleRV)
        btnSampleRV.setOnClickListener{
            val intent = Intent(this@Recycler, SampleRecyclerView::class.java)
            startActivity(intent)
        }
    }
}