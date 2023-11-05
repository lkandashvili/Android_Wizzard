package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ThirdActivity : AppCompatActivity() {

    private lateinit var EditTextID: EditText
    private lateinit var FinishButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bundle = intent.extras

        val editTextID = findViewById<EditText>(R.id.editTextNumber)
        val finishButton = findViewById<Button>(R.id.finishbutton)

        var name: String? = ""
        var lastName: String? = ""


        if (bundle != null) {
            val name: String? = bundle.getString("NAME")
            val lastName: String? = bundle.getString("LASTNAME")
            
        }

        finishButton.setOnClickListener{
            val id = editTextID.text.toString()

            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LASTNAME", lastName)
            intent.putExtra("ID", id)
            startActivity(intent)
        }


    }
}