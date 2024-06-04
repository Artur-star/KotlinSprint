package lesson_16

class Player(
    private val name: String,
    private var health: Int,
    private val strength: Int,
) {
    fun takeDamage(damage: Int) {
        if (playerDeath()) {
            if (health >= damage) {
                health -= damage
                println("Игрок ${this.name} получил урон. Здоровья осталось = ${this.health}")
            } else {
                health = 0
                println("Игрок ${this.name} умер. Его здоровье = ${this.health}")
            }
        }
    }

    fun getTreatment(treatment: Int) {
        if (playerDeath()) {
            health += treatment
            println("Игрок ${this.name} лечиться. Здоровья стало = ${this.health}")

        }
    }

    private fun playerDeath(): Boolean {
        return if (health <= 0) {
            health = 0
            println("Игрок ${this.name} умер. Его здоровье = ${this.health}")
            false
        } else true
    }
}

fun main() {
    val playerArt = Player("Art", 100, 20)

    playerArt.takeDamage(50)
    playerArt.getTreatment(10)
    playerArt.takeDamage(40)
    playerArt.getTreatment(30)
    playerArt.takeDamage(60)
    playerArt.getTreatment(30)
    playerArt.getTreatment(20)
    playerArt.takeDamage(60)
}