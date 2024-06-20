package lesson_20

class Player1(val isKey: Boolean) {}

fun main() {
    val checkKey: (Player1) -> Unit = { player: Player1 ->
        if (player.isKey) {
            println("Игрок открыл дверь")
        } else println("Дверь заперта")
    }

    val player = Player1(false)

    checkKey(player)
}