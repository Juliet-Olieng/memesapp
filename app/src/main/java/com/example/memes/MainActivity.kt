package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvnext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvnext=findViewById(R.id.tvnext)
        tvnext.setOnClickListener {

            var intent=Intent(this,memeb::class.java)
        startActivity(intent)}

        }

}