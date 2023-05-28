package com.aeena.multi_window

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.aeena.multi_window.databinding.ActivityAdjacentBinding
import com.aeena.multi_window.databinding.ActivityMainBinding

class AdjacentActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, AdjacentActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT or Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }

    lateinit var binding: ActivityAdjacentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdjacentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}