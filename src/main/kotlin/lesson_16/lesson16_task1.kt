package lesson_16

class Cube {
    private var randomValue: Int = 0

    fun getRandomValue() {
        println("Выпало число = ${(1..6).random().also { randomValue = it }}")
    }
}

fun main() {
    val cube = Cube()
    cube.getRandomValue()
}