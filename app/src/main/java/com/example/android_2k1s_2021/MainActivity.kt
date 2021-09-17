package com.example.android_2k1s_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spiderManToy = SpiderManFunkoPop(
            "Peter Parker",
            151962,
            6,
            15.0,
            100.0,
        )

        Log.e("SpiderManToy", spiderManToy.headShake())
        Log.e("Availability", spiderManToy.checkAvailability().toString())
        spiderManToy.buy(19, 19.99)
        Log.e("Availability", spiderManToy.checkAvailability().toString())

        val newYearGarland = Garland(
            "Uoito",
            1,
            0,
            19.99,
            100.0,
            100
        )

        Log.e("Availability", newYearGarland.checkAvailability().toString(
        ))
        newYearGarland.buy(19, 19.99)
        Log.e("Availability", newYearGarland.checkAvailability().toString())

    }
}
