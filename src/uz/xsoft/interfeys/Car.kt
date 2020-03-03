package uz.xsoft.interfeys

interface Car {
    fun info(info : String)
    fun show(massage : String)
    fun price(color : String,price : Long)
}

class Person{
    fun getCarAbout(car : Car){ }
}

fun main(args: Array<String>) {
    val person = Person()
    person.getCarAbout(object : Car{
        override fun info(info: String) {

        }

        override fun show(massage: String) {

        }

        override fun price(color: String, price: Long) {
            //something ...
        }

    })

    person.getInfo { color, price ->
        //something ...
    }
}

fun Person.getInfo(f : (color : String,price : Long) -> Unit){
    this.getCarAbout(object : Car{
        override fun info(info: String) { }

        override fun show(massage: String) { }

        override fun price(color: String, price: Long) { f.invoke(color,price)}

    })
}