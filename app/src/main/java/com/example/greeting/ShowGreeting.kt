package com.example.greeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowGreeting : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_greeting)


        textView = findViewById(R.id.textView)
        var userName = intent.getStringExtra("userName")


        if(userName == ""){
            textView.text = "Hello User"
        }
        else{
            textView.text = "Hello  " + userName
        }


        supportActionBar!!.title = "Go Back"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}