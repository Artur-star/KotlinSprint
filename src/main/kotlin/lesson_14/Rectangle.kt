package lesson_14

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}