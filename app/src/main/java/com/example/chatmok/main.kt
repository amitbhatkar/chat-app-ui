package com.example.chatmok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatmok.databinding.ActivityMainBinding

class main : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.genChat.setOnClickListener {
            startActivity(Intent(this,Gen_Chat::class.java))
            finish()
        }

        binding.genImage.setOnClickListener {
            startActivity(Intent(this,Gen_Image::class.java))
            finish()
        }
    }
}