package org.essoft.oop

class Piano : HouseDecor, Instrument {
    var brand: String? = null
    var digital: Boolean? = null
    override var roomName: String
        get() = "Kitchen"
        set(value) {}
}