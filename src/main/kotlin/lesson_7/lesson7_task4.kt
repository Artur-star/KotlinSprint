package lesson_7

fun main() {
    print("Сколько секунд нужно засечь: ")
    val enterUser = readln().toInt()

    for (i in enterUser downTo 0) {
        println(i)
        if (i == 0) break
        Thread.sleep(1000)
    }
    println("Время вышло")
}