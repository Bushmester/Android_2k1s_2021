package com.example.android_2k1s_2021

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import com.example.android_2k1s_2021.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

const val REQUEST_SET_TIMER = 1

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        with(binding) {
            btnSet.setOnClickListener {
                val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
                    putExtra(AlarmClock.EXTRA_MESSAGE, "oooo")
                    putExtra(AlarmClock.EXTRA_LENGTH, Integer.parseInt(etMinutes.text.toString()) * 60)
                    putExtra(AlarmClock.EXTRA_SKIP_UI, true)
                }
                if (intent.resolveActivity(packageManager) != null) {
                    startActivityForResult(intent, REQUEST_SET_TIMER)
                }
            }

            btnSecondAct.setOnClickListener {
                startActivity(
                    Intent(
                        this@MainActivity,
                        SecondActivity::class.java
                    )
                )
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        var message = ""
        if (resultCode == Activity.RESULT_OK) {
            when(requestCode){
                REQUEST_SET_TIMER -> message = "Timer was set"
                else -> super.onActivityResult(requestCode, resultCode, data)
            }
        }
        else {
            message = "Some problems..."
            super.onActivityResult(requestCode, resultCode, data)
        }
        Snackbar.make(
            binding.root,
            message,
            Snackbar.LENGTH_LONG
        ).show()
    }
}
