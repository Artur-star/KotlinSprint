package lesson_10

fun main() {
    val playerThrow = rollingDice1()
    println("the player's move: $playerThrow")
    val computerThrow = rollingDice1()
    println("the computer's move: $computerThrow")

    if (playerThrow > computerThrow) println("Humanity has won")
    else if (playerThrow < computerThrow) println("The robots have won")
    else println("The rivalry continues")
}

fun rollingDice1(): Int = (1..6).random()