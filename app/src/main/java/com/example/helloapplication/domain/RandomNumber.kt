package com.example.helloapplication.domain

import com.example.helloapplication.R
import kotlin.random.Random

class RandomNumber {
    fun execute(): Int {
        return Random.nextInt(101)
    }
}