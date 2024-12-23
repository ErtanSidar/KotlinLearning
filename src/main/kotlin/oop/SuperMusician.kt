package org.essoft.oop

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {

    fun sing() {
        println("singing")
    }
}