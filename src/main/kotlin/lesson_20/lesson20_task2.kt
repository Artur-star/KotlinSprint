package lesson_20

class Player(val name: String, val currentHealth: Int, val maxHealth: Int) {

    override fun toString(): String {
        return "Player(name='$name', currentHealth=$currentHealth, maxHealth=$maxHealth)"
    }
}

fun main() {

    val restoringHealth: (player: Player) -> Player = { p: Player ->
        Player(p.name, p.maxHealth, p.maxHealth)
    }

    val player = Player("Alex", 45, 100)

    println(restoringHealth(player))
}