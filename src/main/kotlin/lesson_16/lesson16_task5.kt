package lesson_16

import kotlin.math.abs

class Player(
    private val name: String,
    private var maxHealth: Int,
    private var strength: Int,
) {
    var currentHealth: Int = maxHealth

    fun takeDamage(damage: Int) {
        val absDamage = abs(damage)
        if (isPlayerDead()) {
            if (currentHealth >= absDamage) {
                currentHealth -= absDamage
                Math.abs(absDamage)
                println("Игрок ${this.name} получил урон. Здоровья осталось = ${this.currentHealth}")
            } else {
                killing()
                println("Игрок ${this.name} умер. Его здоровье = ${this.currentHealth}")
            }
        }
    }

    fun getTreatment(treatment: Int) {
        if (isPlayerDead()) {
            if (treatment + currentHealth <= maxHealth) {
                currentHealth += treatment
                println("Игрок ${this.name} лечиться. Здоровья стало = ${this.currentHealth}")
            } else println("Лечение превышает максимальное значение здоровья. Здоровья осталось = ${this.currentHealth}")
        } else {
            killing()
            println("Игрок ${this.name} умер. Его здоровье = ${this.currentHealth}")
        }
    }

    private fun isPlayerDead(): Boolean = currentHealth > 0

    private fun killing() {
        currentHealth = 0
        strength = 0
    }
}

fun main() {
    val playerArt = Player("Art", 80, 20)

    playerArt.takeDamage(10)
    playerArt.getTreatment(50)
    playerArt.takeDamage(20)
    playerArt.getTreatment(30)
    playerArt.takeDamage(60)
    playerArt.getTreatment(30)
    playerArt.getTreatment(20)
    playerArt.takeDamage(60)
    playerArt.takeDamage(20)
    playerArt.takeDamage(10)
}