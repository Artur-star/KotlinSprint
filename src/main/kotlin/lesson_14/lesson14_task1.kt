package lesson_14

class CargoShip(
    speed: Int = 100,
    loadCapacity: Int = 1500,
    isSplittingIce: Boolean = false,
) : Liner(speed, loadCapacity, isSplittingIce)

class Icebreaker(
    speed: Int = 50,
    loadCapacity: Int = 200,
    isSplittingIce: Boolean = true
) : Liner(speed, loadCapacity, isSplittingIce)

open class Liner(
    val speed: Int = 200,
    val loadCapacity: Int = 500,
    val isSplittingIce: Boolean = false,
) {
    override fun toString(): String {
        return "Liner(speed=$speed, loadCapacity=$loadCapacity, isSplittingIce=$isSplittingIce)"
    }
}

fun main() {
    val liner = Liner()
    val icebreaker = Icebreaker()
    val cargoShip = CargoShip()

    println(liner)
    println(icebreaker)
    println(cargoShip)
}