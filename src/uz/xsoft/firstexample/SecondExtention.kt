package uz.xsoft.firstexample

fun main(args: Array<String>) {
    val car = Car()
    car.show()
}

class Car {
    fun show(){
        println("function in class")
    }
}

fun Car.show(){
    println("function written for class")
}

fun String?.toInfo() : String{
    if (this == null) return "is empty"
    return toString()
}