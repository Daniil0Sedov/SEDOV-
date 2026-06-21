package com.example.rmb_hw2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rmb_hw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateCounter()

        binding.buttonPlus.setOnClickListener {
            count++
            updateCounter()
        }

        binding.buttonMinus.setOnClickListener {
            if (count > 0) {
                count--
                updateCounter()
            }
        }

        binding.buttonReset.setOnClickListener {
            count = 0
            updateCounter()
        }
    }

    private fun updateCounter() {
        binding.textCounter.text = count.toString()
    }
}
