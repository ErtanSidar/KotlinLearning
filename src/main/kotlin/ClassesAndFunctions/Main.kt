package org.essoft.ClassesAndFunctions

fun main() {
    printString("Hello World!")
    add(1, 2)
    add(5, 6)
    println(addWithReturn(1, 2))

    val ertan = Simpson("Ertan", 28, "Nuclear", 85)
    ertan.setHeight(150)

    // Nullability
    var myString : String? = null // ? means nullable
    myString = "Ertan"
    println(myString)

    var myAge : Int? = null
    // myAge = 28
    // println(myAge!! * 5)

    // safe call
    println(myAge?.minus(5))

    // Elvis Operator
    println(myAge ?: 0)

    // let
    myAge?.let {
        println(it * 5)
    }

    if (myAge != null) {
        println(myAge * 5)
    }

}

fun printString(str: String) {
    println(str)
}

fun add(a: Int, b: Int){
    println(a + b)
}

fun addWithReturn(a: Int, b: Int) : Int {
    return a + b
}



