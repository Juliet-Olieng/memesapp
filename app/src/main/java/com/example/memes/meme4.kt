package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme4 : AppCompatActivity() {
    lateinit var tvnext4: TextView
    lateinit var tvprev4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tvnext4=findViewById(R.id.tvnext4)
        tvnext4.setOnClickListener {
            var intent= Intent(this,meme5::class.java)
            startActivity(intent)
        }
        tvprev4=findViewById(R.id.tvprev4)
        tvprev4.setOnClickListener {
            var intent= Intent(this,meme3::class.java)
            startActivity(intent)
        }
    }
}