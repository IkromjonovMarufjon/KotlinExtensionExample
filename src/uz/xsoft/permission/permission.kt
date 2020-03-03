package uz.xsoft.permission



fun main(args: Array<String>) {
    val mobile = Mobile()
    mobile.getMobileColor()
}

class Mobile {
    val color = "black"
}

fun Mobile.getMobileColor(){
    println("this mobile color ${this.color}")
}