package lesson_14

open class Liner2(
    val speed: Int = 200,
    val loadCapacity: Int = 500,
    val isSplittingIce: Boolean = false,
) {
    open fun uploadToShip() {
        println("выдвинуть горизонтальный трап со шкафута")
    }

    override fun toString(): String {
        return "Liner2(speed=$speed, loadCapacity=$loadCapacity, isSplittingIce=$isSplittingIce)"
    }
}