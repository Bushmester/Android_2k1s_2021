package com.example.android_2k1s_2021

open class Product(
    var name: String,
    var count: Int? = 0,
    var ageLimit: Int? = 0,
    var price: Double?,
    var wear: Double,
) {
    fun checkAvailability() : Boolean = this.count != 0

    fun checkSaleOpp(personAge: Int) : Boolean = this.ageLimit ?:0 <= personAge

    fun buy(personAge: Int, personMoney: Double) {
        if (checkAvailability() and checkSaleOpp(personAge)) {
            if (this.price == personMoney) {
                this.count = this.count?.minus(1)
                println("Вы купили ${this.name}")
            }
            else if (this.price ?:0.0 < personMoney) {
                println("Вам не хватает деняг(9(((((")
            }
            else {
                println("Мужик, ты чего...")
            }
        }
        else {
            println("Стафчика больше нету((((((")
        }
    }
}
