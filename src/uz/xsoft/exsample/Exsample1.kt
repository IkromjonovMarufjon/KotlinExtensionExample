package uz.xsoft.exsample

fun main(args: Array<String>) {
    val car = Car("Black")
    val person = Person(car)
    person.show()
    //bu method ishlamaydi
    //car.info
}

class Car(val color :  String)

class Person(val car : Car){

    fun Car.info(){
        println("it is color ${this.color}")
    }

    fun show(){
        car.info()
    }
}