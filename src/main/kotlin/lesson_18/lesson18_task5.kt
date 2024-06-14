package lesson_18

abstract class Figure {}

class Point : Figure() {}

class Circle : Figure() {}

class Square : Figure() {}

class Screen {
    fun draw(x: Int, y: Int, figure: Figure) {}

    fun draw(x: Float, y: Float, figure: Figure) {}
}

fun main() {
    val screen = Screen()
    screen.draw(1, 2, Point())
}