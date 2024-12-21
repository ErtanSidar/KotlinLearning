package org.essoft.ClassesAndFunctions

// primary constructor
// if you use val, you cannot change value of properties
class Simpson(var name : String, var age : Int, var job : String, var weight : Int) {
    // you can add extra property in class without primary constructor
    private var height = 0 // private, protected, internal, public

    fun setHeight(height : Int) {
        this.height = height
    }


    /*
    // property
    var name = ""
    var age = 0
    var job = ""
    var weight = 0

    // constructor
    constructor() {}
    // secondary constructor
    constructor(name: String, age: Int, job: String, weight: Int) {
        this.name = name
        this.age = age
        this.job = job
        this.weight = weight
    }
    */
}