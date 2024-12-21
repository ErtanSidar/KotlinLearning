package org.essoft

fun main() {
    val myMusicians = arrayListOf("Ertan", "Sidar", "Osman")
    println(myMusicians)

    val myMusicians2 = ArrayList<String>()
    myMusicians2.add("Ertan")
    myMusicians2.add("Sidar")
    myMusicians2.add("Osman")
    println(myMusicians2)
    myMusicians2.add(1, "Emre")
    println(myMusicians2)

    val myAges = ArrayList<Int>()
    myAges.add(1)
    myAges.add(2)
    myAges.add(3)
    println(myAges)
    
    val mixedArrayList = arrayListOf("Ertan", 1, 2.2)
    println(mixedArrayList)
}