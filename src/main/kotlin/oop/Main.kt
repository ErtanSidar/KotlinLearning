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

    //polymorphism
    var mathematics = Mathematics()
    println(mathematics.sum())
    println(mathematics.sum(5, 6))
    println(mathematics.sum(7, 8, 9))

    // dynamic polymorphism
    var animal = Animal()
    animal.sign()

    var barley = Dog()
    barley.test()
    barley.sign()

    //abstract & interface
    // var people = People() -> Cannot create an instance of an abstract class
    var piano = Piano()
    piano.brand = "Yamaha"
    piano.digital = false
    println(piano.roomName)
    piano.info()

}