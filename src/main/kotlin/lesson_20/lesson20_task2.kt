package lesson_20

class Player(val name: String, var currentHealth: Int, val maxHealth: Int) {

    override fun toString(): String {
        return "Player(name='$name', currentHealth=$currentHealth, maxHealth=$maxHealth)"
    }
}

fun main() {

    val restoringHealth: (Player) -> Unit = { p: Player ->
        p.currentHealth = p.maxHealth
    }

    val player = Player("Alex", 45, 100)

    restoringHealth(player)
    println(player)
}