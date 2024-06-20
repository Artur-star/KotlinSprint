package lesson_21

class Player(val name: String, var currentHealth: Int, val maxHealth: Int) {

    override fun toString(): String {
        return "Player(name='$name', currentHealth=$currentHealth, maxHealth=$maxHealth)"
    }
}

fun Player.isHealthy(): Boolean {
    return if (currentHealth == maxHealth) true
    else false
}

fun main() {
    val player1 = Player("Alex", 100, 100)
    println(player1.isHealthy())
}