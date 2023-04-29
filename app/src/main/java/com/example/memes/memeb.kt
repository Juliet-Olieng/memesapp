package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memeb : AppCompatActivity() {
    lateinit var tvnextb:TextView
    lateinit var tvprevb:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memeb)
        tvnextb=findViewById(R.id.tvnextb)
        tvnextb.setOnClickListener {
            var intent=Intent(this,meme3::class.java)
            startActivity(intent)
        }
        tvprevb=findViewById(R.id.tvprevb)
        tvprevb.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}