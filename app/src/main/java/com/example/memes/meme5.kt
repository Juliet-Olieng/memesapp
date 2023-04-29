package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme5 : AppCompatActivity() {
    lateinit var tvprev5: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tvprev5=findViewById(R.id.tvprev5)
        tvprev5.setOnClickListener {

            var intent= Intent(this,meme4::class.java)
            startActivity(intent)}
    }
}