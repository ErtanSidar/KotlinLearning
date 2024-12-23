package org.essoft.oop

fun main() {
    // classes
    val user = User("Sidar", 27)
    println(user.name)
    println(user.age)

    // encapsulation
    var james = Musician("James", "Guitar", 27)
    println(james.name)
    println(james.age)

    //inheritance
    var lars = SuperMusician("Lars", "Drums", 65)
    println(lars.name)
    lars.sing()


}