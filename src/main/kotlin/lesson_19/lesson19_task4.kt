package lesson_19

enum class Patrons(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {
    private var patron: Int = 0

    fun loadNewCartridge(patrons: Patrons) {
        patron = patrons.damage
    }

    fun shoot() {
        println("Танк нанес урон: $patron")
    }
}

fun main() {
    val t34 = Tank()
    t34.loadNewCartridge(Patrons.BLUE)
    t34.shoot()
    t34.loadNewCartridge(Patrons.RED)
    t34.shoot()
}