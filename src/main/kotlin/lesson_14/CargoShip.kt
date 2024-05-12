package lesson_14

class CargoShip(
    speed: Int = 100,
    loadCapacity: Int = 1500,
    isSplittingIce: Boolean = false,
) : Liner(speed, loadCapacity, isSplittingIce)