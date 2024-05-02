package lesson_7

fun main() {
    print("Сколько секунд нужно засечь: ")
    val enterUser = readln().toInt()

    for (i in enterUser downTo 1) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}