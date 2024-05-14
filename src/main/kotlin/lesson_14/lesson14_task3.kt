package lesson_14

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        return Math.PI * radius.times(radius)
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

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

fun main() {
    val listFigure = mutableListOf<Figure>()
    listFigure.apply {
        add(Circle("Black", 10.0))
        add(Circle("White", 5.5))
        add(Rectangle("Black", 10.0, 15.0))
        add(Rectangle("White", 20.0, 5.4))
    }

    val sumPerimetersBlackPieces =
        listFigure.filter { it.color.equals("Black", ignoreCase = true) }.map { it.calculatePerimeter() }.sum()
    System.out.printf("Сумма периметров всех черных фигур: %.2f\n", sumPerimetersBlackPieces)

    val sumSquaresWhiteFigures =
        listFigure.filter { it.color.equals("White", ignoreCase = true) }.map { it.calculateArea() }.sum()
    System.out.printf("Сумма площадей всех белых фигур: %.2f", sumSquaresWhiteFigures)
}