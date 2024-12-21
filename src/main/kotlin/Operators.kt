package org.essoft

fun main() {
    var m = 5
    println(m)
    m += 1;
    println(m)
    m++
    println(m)
    m--
    println(m)
    m += 5
    println(m)
    m -= 5
    println(m)
    m *= 5
    println(m)
    m /= 5
    println(m)
    m %= 5
    println(m)

    var n = 7

    // && -> and
    // || -< or
    println(n>m && n<m)
    println(n>m || n<m)

    // ! -> not
    println(!true) // false
}