package org.essoft

fun main() {
    val day = 3
    var dayString = ""

    when (day) {
        1 -> dayString = "Monday"
        2 -> dayString = "Tuesday"
        3 -> dayString = "Wednesday"
        4 -> dayString = "Thursday"
        5 -> dayString = "Friday"
        6 -> dayString = "Saturday"
        7 -> dayString = "Sunday"
        else -> dayString = "Invalid day"
    }

    println(dayString)
}