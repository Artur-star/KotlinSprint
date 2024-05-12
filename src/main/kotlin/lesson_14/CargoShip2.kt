package lesson_14

class CargoShip2(
    speed: Int = 100,
    loadCapacity: Int = 1500,
    isSplittingIce: Boolean = false,
) : Liner2(speed, loadCapacity, isSplittingIce) {

    override fun uploadToShip() {
        println("активировать погрузочный кран")
    }
}