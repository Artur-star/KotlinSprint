package lesson_6

fun main() {
    val userEnterNumber = 2
    var counter = 0

    while (userEnterNumber > counter) {
        counter++
        Thread.sleep(1000)
    }
    println("Прошло $counter секунд")
}