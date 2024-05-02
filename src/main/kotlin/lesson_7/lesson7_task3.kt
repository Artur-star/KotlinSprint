package lesson_7

fun main() {
    println("Введи число: ")
    val enterUser = readln().toInt()
    val progression = 0 ..enterUser step 2

    for (i in progression) {
        println(i)
    }
}