package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bundle = intent.extras

        textView = findViewById(R.id.textView)

        if (bundle != null) {
            val name: String? = bundle.getString("NAME")
            val lastName: String? = bundle.getString("LASTNAME")

            val result = "Name: $name. Lastname: $lastName"
            textView.text = result
        }


    }
}