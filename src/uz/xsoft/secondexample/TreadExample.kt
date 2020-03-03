package uz.xsoft.secondexample

fun main(args: Array<String>) {
    Person.show()
}

class Person(val age : Int){
    companion object {}
}

fun Person.Companion.show(){
    println("this person age 18")
}


val <T> List<T>.lastIndex: Int
    get() = size - 1
