package com.example.helloapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloapplication.R
import com.example.helloapplication.databinding.ActivityMainBinding
import com.example.helloapplication.domain.RandomNumber
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val generateRandomNumber = RandomNumber()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonClick.setOnClickListener {
            binding.textRandom.text = getString(R.string.generated_number, generateRandomNumber.execute())
        }
    }
}