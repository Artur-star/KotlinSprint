package lesson_14

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        return 2 * Math.PI * radius.times(radius)
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}