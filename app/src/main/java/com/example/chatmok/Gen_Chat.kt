package com.example.chatmok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatmok.databinding.ActivityGenChatBinding

class Gen_Chat : AppCompatActivity() {

    private lateinit var binding: ActivityGenChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGenChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {

            startActivity(Intent(this,main::class.java))
            finish();
        }

    }
}