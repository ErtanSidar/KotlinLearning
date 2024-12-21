package org.essoft

fun main() {
    val fruitCalorieMap = HashMap<String, Int>() // key <-> value
    fruitCalorieMap.put("apple", 100)
    fruitCalorieMap.put("banana", 150)
    fruitCalorieMap.put("orange", 200)
    println(fruitCalorieMap["apple"])
    println(fruitCalorieMap)

    val myHashMap = HashMap<String, String>()
    val myNewMap = hashMapOf<String, Int>("Ertan" to 1, "Sidar" to 2, "Osman" to 3)
}