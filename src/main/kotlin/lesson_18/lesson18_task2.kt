package lesson_18

interface Dice {
    fun rollDiceAndPrintValues()
}

class FourSidedDice : Dice {
    override fun rollDiceAndPrintValues() {
        println("Бросили кость с 4 гранями")
    }
}

class SixSidedDice : Dice {
    override fun rollDiceAndPrintValues() {
        println("Бросили кость с 6 гранями")
    }
}

class EightSidedDice : Dice {
    override fun rollDiceAndPrintValues() {
        println("Бросили кость с 8 гранями")
    }
}

fun main() {
    val diceFourSided: Dice = FourSidedDice()
    val sixSidedDice: Dice = SixSidedDice()
    val eightSidedDice: Dice = EightSidedDice()

    val listDices = listOf<Dice>(diceFourSided, sixSidedDice, eightSidedDice)

    listDices.forEach { it.rollDiceAndPrintValues() }
}