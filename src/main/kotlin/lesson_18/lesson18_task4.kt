package lesson_18

import kotlin.math.pow

abstract class Box() {
    abstract fun calculationSurfaceArea(): Double
}

class RectangularBox(
    val lengthEdge: Double,
    val widthEdge: Double,
    val heightEdge: Double,
) : Box() {
    override fun calculationSurfaceArea(): Double {
        return 2 * (lengthEdge * widthEdge + lengthEdge * heightEdge + widthEdge * heightEdge)
    }
}

class CubicBox(val lengthEdge: Double) : Box() {
    override fun calculationSurfaceArea(): Double = 6 * lengthEdge.pow(2)
}

fun main() {
    val cubic: Box = CubicBox(4.0)
    val rectangular: Box = RectangularBox(4.0, 3.0, 2.0)

    println(cubic.calculationSurfaceArea())
    println(rectangular.calculationSurfaceArea())
}