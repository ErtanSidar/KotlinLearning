package org.essoft.oop

class User : People {

    var name : String? = null
    var age : Int? = null

    constructor() {}

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

}