package lesson_10

fun main() {
    var count = 0
    do {
        if (conductRound()) {
            println("Humanity has won")
            count++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().equals("да", ignoreCase = true))

    println("Человек выиграл $count")
}

fun rollingDice(): Int = (1..6).random()

fun conductRound(): Boolean {
    val playerThrow = rollingDice()
    println("the player's move: $playerThrow")
    val computerThrow = rollingDice()
    println("the computer's move: $computerThrow")
    return playerThrow > computerThrow
}