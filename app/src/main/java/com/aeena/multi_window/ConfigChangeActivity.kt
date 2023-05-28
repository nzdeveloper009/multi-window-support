package com.aeena.multi_window

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aeena.multi_window.databinding.ActivityConfigChangeBinding

class ConfigChangeActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ConfigChangeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }
    lateinit var binding:ActivityConfigChangeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfigChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if(newConfig.screenHeightDp < 300) {
            Toast.makeText(this,"Screen size is less than 300", Toast.LENGTH_LONG).show()
        }
    }
}