package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme3 : AppCompatActivity() {
    lateinit var tvnextc: TextView
    lateinit var tvprevc: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        tvnextc=findViewById(R.id.tvnextc)
        tvnextc.setOnClickListener {
            var intent= Intent(this,meme4::class.java)
            startActivity(intent)
        }
        tvprevc=findViewById(R.id.tvprevc)
        tvprevc.setOnClickListener {
            var intent= Intent(this,memeb::class.java)
            startActivity(intent)
        }
    }

}