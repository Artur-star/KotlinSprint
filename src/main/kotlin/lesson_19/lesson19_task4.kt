package lesson_19

enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {
    private var patron: Int = 0

    fun loadNewCartridge(patron: Patron) {
        this.patron = patron.damage
    }

    fun shoot() {
        println("Танк нанес урон: $patron")
    }
}

fun main() {
    val t34 = Tank()
    t34.loadNewCartridge(Patron.BLUE)
    t34.shoot()
    t34.loadNewCartridge(Patron.RED)
    t34.shoot()
}