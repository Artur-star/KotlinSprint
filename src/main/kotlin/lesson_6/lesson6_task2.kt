package lesson_6

fun main() {
    val numberUser: Long = 2

    Thread.sleep(1000 * numberUser)
    println("Прошло $numberUser секунд")
}