package org.essoft.oop

class Dog : Animal() {
    fun test() {
        super.sign()
    }

    override fun sign() {
        println("dog class")
    }
}