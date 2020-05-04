package com.example.apintilie_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        val buttonBooks = findViewById<Button>(R.id.books)
        buttonBooks.setOnClickListener {
            val intent = Intent(this, Books::class.java);
            startActivity(intent);}
        val buttonTutorials = findViewById<Button>(R.id.tutorials)
        buttonTutorials.setOnClickListener {
            val intent = Intent(this, Tutorials::class.java);
            startActivity(intent);}
        val buttonNotes = findViewById<Button>(R.id.notes)
        buttonNotes.setOnClickListener {
            val intent = Intent(this, Notes::class.java);
            startActivity(intent);}

    }
}
