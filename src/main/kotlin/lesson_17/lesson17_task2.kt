package lesson_17

class Ship() {
    var name: String = "Titanic"
        set(value) {
            if (value != field) {
                println("Предупреждение! Название корабля менять запрещено.")
            }
        }

    var homePort: String = "Liverpool"
    var speed: Int = 42
}

fun main() {
    val ship = Ship()

    ship.name = "Avrora"
    ship.speed = 40
    ship.homePort = "Southampton"

    println(
        "Название корабля: ${ship.name}, скорость: ${ship.speed} км/ч, " +
                "порт приписки: ${ship.homePort}"
    )
}