package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.extras

        editText = findViewById(R.id.editTextText2)
        button = findViewById(R.id.button2)

        var name: String? = ""

        if (bundle != null) {
            val name = bundle.getString("NAME")
        }

        button.setOnClickListener {

            val lastName = editText.text.toString()

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LASTNAME", lastName)
            startActivity(intent)

        }

    }
}