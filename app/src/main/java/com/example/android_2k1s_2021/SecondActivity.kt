package com.example.android_2k1s_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_2k1s_2021.databinding.ActivitySecondBinding
import com.google.android.material.snackbar.Snackbar

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        intent?.also {
            if(intent.action == Intent.ACTION_VIEW) {
                Snackbar.make(
                    binding.root,
                    "Your geolocation is opened!",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }
}
