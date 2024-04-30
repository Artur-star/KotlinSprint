package lesson_6

fun main() {
    val numberUser = 5
    var counter = 0

    while (numberUser > counter) {
        Thread.sleep(1000)
        counter++
    }

    println("Прошло $counter секунд")
}