package lesson_16

class Cube {
    private var randomValue: Int = 0

    fun getRandomValue() = (1..6).random().also { randomValue = it }
}

fun main() {
    val cube = Cube()
    println("Выпало число = ${cube.getRandomValue()}")
}