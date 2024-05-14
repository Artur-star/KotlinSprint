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

class Icebreaker2(
    speed: Int = 50,
    loadCapacity: Int = 200,
    isSplittingIce: Boolean = true,
) : Liner2(speed, loadCapacity, isSplittingIce) {

    override fun uploadToShip() {
        println("открыть ворота со стороны кормы")
    }
}

class CargoShip2(
    speed: Int = 100,
    loadCapacity: Int = 1500,
    isSplittingIce: Boolean = false,
) : Liner2(speed, loadCapacity, isSplittingIce) {

    override fun uploadToShip() {
        println("активировать погрузочный кран")
    }
}

fun main() {
    val liner2 = Liner2()
    val icebreaker2 = Icebreaker2()
    val cargoShip2 = CargoShip2()

    print("Лайнер: ")
    liner2.uploadToShip()

    print("Ледокол: ")
    icebreaker2.uploadToShip()

    print("Грузовой корабль: ")
    cargoShip2.uploadToShip()
}