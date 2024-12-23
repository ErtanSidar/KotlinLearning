package org.essoft

fun main() {
    val myArray = arrayOf("Ertan", "Sidar", "Emre")

    //index
    println(myArray[0])
    myArray[0] = "Osman"
    println(myArray[0]) //Osman

    myArray.set(1, "Ertan")
    println(myArray[1]) //Ertan

    //size
    println(myArray.size)

    val numberArray = arrayOf(1, 2, 3, 4, 5) // index start from 0
    println(numberArray[3]) // 4
    // println(numberArray[5]) -> ArrayIndexOutOfBoundsException

    val myNewArray = doubleArrayOf(1.1, 2.2, 3.3, 4.4, 5.5) // double

    val mixedArray = arrayOf("Ertan", 1, 2.2)
    println(mixedArray[0]) // Ertan
    println(mixedArray[1]) // 1
    println(mixedArray[2]) // 2.2
}