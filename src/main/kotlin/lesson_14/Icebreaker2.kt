package lesson_14

class Icebreaker2(
    speed: Int = 50,
    loadCapacity: Int = 200,
    isSplittingIce: Boolean = true,
) : Liner2(speed, loadCapacity, isSplittingIce) {

    override fun uploadToShip() {
        println("открыть ворота со стороны кормы")
    }
}