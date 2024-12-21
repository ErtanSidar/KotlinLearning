package org.essoft


fun main() {
    // variables
    var x = 5;
    var y = 4;

    println(x * y)

    var age = 35
    println(age / 7 * 5)

    val result = age / 7 * 5
    println(result)

    age = 36

    println(age)

    // constants

    val name = "Ertan"
    // name = "Sidar" -> Val cannot be reassigned
    val aa = 5;

    // Defining
    var myInteger: Int

    // Initialize
    myInteger = 5
    // myInteger = 6 -> Val cannot be reassigned
    // myInteger = "Ertan" -> Type mismatch.

    val a: Int = 5

    println(a / 2) // 2

    // Double & Float
    val pi = 3.14
    println(pi * 2) // 6.28

    val myFloat = 3.14f
    println(myFloat * 2)

    var myAge: Double
    myAge = 35.0
    println(myAge / 2)

    var myLong: Long = 100
    println(myLong)

    // String
    val myName = "Ertan"
    println(myName)

    val mySurname = "Sidar"
    println(mySurname)

    val fullName = myName + " " + mySurname
    println(fullName)

    val city: String = "istanbul"
    println(city.capitalize())

    //Boolean
    var myBoolean: Boolean = true
    println(myBoolean)

    var isAlive = true
    println(isAlive)

    // <, >, <=, >=, ==, !=
    var ab = 5
    var ba = 6
    println(ab < ba)
    println(ab > ba)
    println(ab <= ba)
    println(ab >= ba)
    println(ab == ba)
    println(ab != ba)

    // Conversion
    val myNumber = 5
    val myLongNumber = myNumber.toLong()
    println(myLongNumber)

    var input = "10"
    var number = input.toInt()
    println(number * 2)
}