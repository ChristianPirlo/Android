package com.example.progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SampleList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        val btnShowList : Button = findViewById(R.id.btnShowList)
        btnShowList.setOnClickListener{
            val intent = Intent(this@SampleList, SampleListView::class.java)
            startActivity(intent)
        }
    }
}