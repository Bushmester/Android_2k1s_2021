package com.example.android_2k1s_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.android_2k1s_2021.databinding.ActivityMainBinding


private const val TAG_NEWS = "TAG_NEWS"
private const val TAG_MSG = "TAG_MSG"
private const val TAG_PROFILE = "TAG_PROFILE"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        supportFragmentManager.beginTransaction().run{
            setCustomAnimations(
                R.anim.enter_from_right,
                R.anim.exit_to_left,
                R.anim.enter_from_left,
                R.anim.exit_to_right
            )
            add(R.id.fragment_container, NewsFragment(), TAG_NEWS)
        }

        with(binding){
            newsBtn.setOnClickListener{
                changeFragment(NewsFragment())
            }
            msgBtn.setOnClickListener{
                changeFragment(MessageFragment())
            }
            profileBtn.setOnClickListener{
                changeFragment(ProfileFragment())
            }
        }
    }

    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().run{
            setCustomAnimations(
                R.anim.enter_from_right,
                R.anim.exit_to_left,
                R.anim.enter_from_left,
                R.anim.exit_to_right
            )
            replace(R.id.fragment_container, fragment)
            addToBackStack(null)
            commit()
        }
    }
}
