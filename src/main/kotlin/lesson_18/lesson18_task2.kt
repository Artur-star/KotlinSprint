package lesson_18

open class Dice(val sides: Int) {
    fun rollDice() {
        println("Бросили кость с ${sides} гранями")
    }
}

class FourSidedDice : Dice(4)

class SixSidedDice : Dice(6)

class EightSidedDice : Dice(8)

fun main() {
    val diceFourSided: Dice = FourSidedDice()
    val sixSidedDice: Dice = SixSidedDice()
    val eightSidedDice: Dice = EightSidedDice()

    val listDices = listOf<Dice>(diceFourSided, sixSidedDice, eightSidedDice)

    listDices.forEach { it.rollDice() }
}