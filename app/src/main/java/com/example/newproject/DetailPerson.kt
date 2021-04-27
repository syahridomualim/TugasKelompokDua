package com.example.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newproject.databinding.ActivityDetailPersonBinding

class DetailPerson : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPersonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailPersonBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}