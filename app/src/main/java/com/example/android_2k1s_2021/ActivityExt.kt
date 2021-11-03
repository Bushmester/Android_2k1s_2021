package com.example.android_2k1s_2021

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

fun AppCompatActivity.findController (id: Int) : NavController? {
    val selectedFragment = supportFragmentManager.findFragmentById(id) as NavHostFragment?
    return selectedFragment?.navController
}
