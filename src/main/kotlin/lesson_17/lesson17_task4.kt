package lesson_17

class Package(
    val packageNumber: Int,
    initialLocation: String,
) {
    var initialLocation: String = initialLocation
        set(value) {
            if (initialLocation != value) {
                movementCounter++
            }
            field = value
        }

    var movementCounter: Int = 0
}

fun main() {
    val pack = Package(1, "Moscow")
    pack.initialLocation = "Ufa"
    pack.initialLocation = "Kazan"

    println(pack.movementCounter)
}