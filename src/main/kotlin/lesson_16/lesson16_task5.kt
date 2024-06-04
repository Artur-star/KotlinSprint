package lesson_16

import kotlin.math.abs

class Player(
    private val name: String,
    private var health: Int,
    private val strength: Int,
) {
    fun takeDamage(damage: Int) {
        val absDamage = abs(damage)
        if (isPlayerDead()) {
            if (health >= absDamage) {
                health -= absDamage
                Math.abs(absDamage)
                println("Игрок ${this.name} получил урон. Здоровья осталось = ${this.health}")
            } else {
                killing()
                println("Игрок ${this.name} умер. Его здоровье = ${this.health}")
            }
        }
    }

    fun getTreatment(treatment: Int) {
        if (isPlayerDead()) {
            if (treatment <= health) {
                health += treatment
                println("Игрок ${this.name} лечиться. Здоровья стало = ${this.health}")
            } else println("Лечение превышает максимальное значение здоровья. Здоровье = ${this.health}")
        } else {
            killing()
            println("Игрок ${this.name} умер. Его здоровье = ${this.health}")
        }
    }

    private fun isPlayerDead(): Boolean = health > 0

    private fun killing() {
        health = 0
    }
}

fun main() {
    val playerArt = Player("Art", 100, 20)

    playerArt.takeDamage(50)
    playerArt.getTreatment(100)
    playerArt.takeDamage(40)
    playerArt.getTreatment(30)
    playerArt.takeDamage(60)
    playerArt.getTreatment(30)
    playerArt.getTreatment(20)
    playerArt.takeDamage(60)
}