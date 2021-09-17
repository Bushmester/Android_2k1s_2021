package com.example.android_2k1s_2021

interface LampInterface {
    fun turnUpBrightness(value: Int)
    fun turnDownBrightness(value: Int)
    fun turnBrightness(sign: String, value: Int) = when (sign) {
        "+" -> turnUpBrightness(value)
        else -> turnDownBrightness(value)
    }
}
