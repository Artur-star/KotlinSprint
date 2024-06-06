package lesson_17

class Ship(var homePort: String, name: String, var speed: Int) {
    var name: String = name
        set(value) {
            println("Предупреждение! Название корабля менять запрещено.")
        }
}

fun main() {
    val ship = Ship("Titanic", "Liverpool", 42)

    ship.name = "Avrora"
    ship.speed = 40
    ship.homePort = "Southampton"

    println(
        "Название корабля: ${ship.name}, скорость: ${ship.speed} км/ч, " +
                "порт приписки: ${ship.homePort}"
    )
}