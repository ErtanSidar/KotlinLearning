package org.essoft

fun main() {
    val mySet = setOf<Int>(1, 1, 2, 3, 4, 5)
    println(mySet)
    println(mySet.size)

    mySet.forEach {
        println(it)
    }

    val myStringSet = HashSet<String>()
    myStringSet.add("Ertan")
    myStringSet.add("Ertan")
    println(myStringSet)
}