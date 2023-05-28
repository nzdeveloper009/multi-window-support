package com.aeena.multi_window

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aeena.multi_window.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.launchBtn.setOnClickListener {
            AdjacentActivity.start(this)
        }
    }
}