package lesson_20

class Player(val isKey: Boolean) {}

fun main() {
    val checkKey: (Player) -> Unit = { player: Player ->
        if (player.isKey) {
            println("Игрок открыл дверь")
        } else println("Дверь заперта")
    }

    val player = Player(false)

    checkKey(player)
}