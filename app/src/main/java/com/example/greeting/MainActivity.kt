package com.example.greeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName : EditText
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         editTextName  = findViewById(R.id.editTextName)
         button  = findViewById(R.id.button)



        button.setOnClickListener {

            var intent : Intent = Intent(this@MainActivity , ShowGreeting::class.java)
            intent.putExtra("userName",editTextName.text.toString())
            startActivity(intent)

        }


    }
}