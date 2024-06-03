package lesson_16

private const val PI = 3.14

class Circle(
    private val radius: Double
) {
    fun lenghtCircle(): Double = 2 * PI * radius

    fun squareCircle(): Double = PI * radius * radius
}

fun main() {
    val circle = Circle(1.0)
    println("Длина окружности: ${circle.lenghtCircle()}")
    println("Площадь круга: ${circle.squareCircle()}")
}