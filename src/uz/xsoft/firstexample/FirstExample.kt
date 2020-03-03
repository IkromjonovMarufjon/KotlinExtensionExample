package uz.xsoft.firstexample

fun <T> ArrayList<T>.swap(index1: Int, index2: Int) {
    val amount = this[index1]
    this[index1] = this[index2]
    this[index2] = amount
}

fun main(args: Array<String>) {
    val list = arrayListOf<Int>(1, 2, 3, 4, 5)
    list.swap(2, 3)
}

