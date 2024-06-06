package lesson_17

class Package(
    val packageNumber: Int,
    currentLocation: String,
) {
    var currentLocation: String = currentLocation
        set(value) {
            if (currentLocation != value) {
                movementCounter++
            }
            field = value
        }

    var movementCounter: Int = 1
}

fun main() {
    val pack = Package(1, "Moscow")
    pack.currentLocation = "Ufa"
    pack.currentLocation = "Kazan"

    println(pack.movementCounter)
}