package lesson_10

fun main() {
    println("Человек выиграл ${round()} ")
}

fun rollingDice(): Int = (1..6).random()

fun round(): Int {
    var count = 0
    do {
        val playerThrow = rollingDice()
        println("the player's move: $playerThrow")
        val computerThrow = rollingDice()
        println("the computer's move: $computerThrow")

        if (playerThrow > computerThrow) {
            println("Humanity has won")
            count++
        } else if (playerThrow < computerThrow) println("The robots have won")
        else println("The rivalry continues")

        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().lowercase() == "да")
    return count
}