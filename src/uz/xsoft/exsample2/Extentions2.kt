package uz.xsoft.exsample2

fun main(args: Array<String>) {
    val color = Color("Black")

    val car = Car()
    car.info(color)

    val person = Person()
    person.info(color)
}

class Color(val color : String)

open class Car(){
    fun Color.Info(){
        println("this is info extention")
    }

    open fun Color.show(){
        println("this is show extention")
    }

    open fun info(color: Color){
        color.Info()
        color.show()
    }
}

class Person : Car() {
    override fun Color.show() {
        println("this show function in Person class")
    }

    override fun info(color: Color) {
        color.show()
        super.info(color)
    }
}