package com.example.chatmok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatmok.databinding.ActivityGenImageBinding

class Gen_Image : AppCompatActivity() {

    private lateinit var binding:ActivityGenImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGenImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BackBtn.setOnClickListener {

            startActivity(Intent(this,main::class.java))
            finish()
        }


    }
}