package com.example.android_2k1s_2021

class SpiderManFunkoPop(
    name: String,
    count: Int?,
    ageLimit: Int?,
    price: Double?,
    wear: Double
) : Product(name, count, ageLimit, price, wear), MarvelFunkoPopInterface {

    override fun headShake(): String {
        this.wear -= 0.5
        return "БАШКОТРЯЯЯЯЯС!!!!!!!!!"
    }

    override fun setOnStand(): String {
        return "Теперь красивенький стоит))))))))"
    }
}
