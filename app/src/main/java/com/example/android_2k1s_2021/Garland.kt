package com.example.android_2k1s_2021

class Garland(
    name: String,
    count: Int?,
    ageLimit: Int?,
    price: Double?,
    wear: Double,
    var brigh: Int,
) : Product(name, count, ageLimit, price, wear), LampInterface {
    override fun turnUpBrightness(value: Int) {
        this.brigh += value
    }

    override fun turnDownBrightness(value: Int) {
        this.brigh -= value
    }
}
