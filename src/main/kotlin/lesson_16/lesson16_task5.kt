package lesson_16

import kotlin.math.abs

private const val MAX_HEALTH = 100

class Player(
    private val name: String,
    private var strength: Int,
) {
    private var health: Int = MAX_HEALTH

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
            if (treatment + health <= MAX_HEALTH) {
                health += treatment
                println("Игрок ${this.name} лечиться. Здоровья стало = ${this.health}")
            } else println("Лечение превышает максимальное значение здоровья. Здоровья осталось = ${this.health}")
        } else {
            killing()
            println("Игрок ${this.name} умер. Его здоровье = ${this.health}")
        }
    }

    private fun isPlayerDead(): Boolean = health > 0

    private fun killing() {
        health = 0
        strength = 0
    }
}

fun main() {
    val playerArt = Player("Art", 20)

    playerArt.takeDamage(50)
    playerArt.getTreatment(100)
    playerArt.takeDamage(40)
    playerArt.getTreatment(30)
    playerArt.takeDamage(60)
    playerArt.getTreatment(30)
    playerArt.getTreatment(20)
    playerArt.takeDamage(60)
}