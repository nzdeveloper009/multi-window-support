package com.aeena.multi_window

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aeena.multi_window.databinding.ActivityPictureInPictureBinding

class PictureInPictureActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, PictureInPictureActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }
    lateinit var binding: ActivityPictureInPictureBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPictureInPictureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pipBtn.setOnClickListener {
            enterPictureInPictureMode()
        }

    }

    override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode)

        if(isInPictureInPictureMode) {
            Toast.makeText(this,"Is Picture in Picture Mode", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this,"Is Not Picture in Picture Mode", Toast.LENGTH_LONG).show()
        }
    }
}