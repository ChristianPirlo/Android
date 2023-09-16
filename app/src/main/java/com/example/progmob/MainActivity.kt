package com.example.progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var button : Button
    lateinit var  edInputNama : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.TextView2)
        tvMain.text = "Halo Progmob 2023"

        val button6 : Button = findViewById(R.id.button6)

        button6.setOnClickListener{
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

        val button7 : Button = findViewById(R.id.button7)

        button7.setOnClickListener{
            val intent = Intent(this@MainActivity, activity_constraint::class.java)
            startActivity(intent)
        }

        val button9 : Button = findViewById(R.id.button9)

        button9.setOnClickListener{
            val intent = Intent(this@MainActivity, ProteinTrackerActivity::class.java)
            startActivity(intent)
        }

        button = findViewById(R.id.button)
        button.text = getString(R.string.progmob_2023)

        edInputNama = findViewById(R.id.editTextNama)

        button.setOnClickListener(View.OnClickListener { view ->
            tvMain.text = edInputNama.text.toString()
        })
    }
}
