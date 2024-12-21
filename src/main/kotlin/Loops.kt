package org.essoft

fun main() {
    // For Loop
    val myArrayOfNumbers = arrayOf(1, 2, 3, 4, 5)

    for (number in myArrayOfNumbers) {
        println(number)
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    // For Each Loop
    val myMusicians = arrayOf("Ertan", "Sidar", "Osman")
    myMusicians.forEach { println(it) }

    for (musician in myMusicians) {
        println(musician)
    }

    // While Loop
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    // Do While Loop
    var j = 1
    do {
        println(j)
        j++
    } while (j <= 10)


}