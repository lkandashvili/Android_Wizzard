package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FinishActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val bundle = intent.extras

        val textView = findViewById<TextView>(R.id.textView)

        var name: String? = ""
        var lastName: String? = ""

        if (bundle != null) {
            val name: String? = bundle.getString("NAME")
            val lastName: String? = bundle.getString("LASTNAME")
            val id: Long? = bundle.getLong("ID")

            val result = "Name: $name. Lastname: $lastName. ID: $id"
            textView.text = result
        }

    }
}