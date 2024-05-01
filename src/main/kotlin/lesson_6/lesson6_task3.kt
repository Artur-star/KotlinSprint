package lesson_6

fun main() {
    val userEnterNumber = 4
    var counter = 0

    while (userEnterNumber > counter) {
        println("Осталось секунд: ${userEnterNumber - counter++}")
        Thread.sleep(1000)
    }
    println("Осталось секунд: ${userEnterNumber - counter}")
    println("Время вышло")
}