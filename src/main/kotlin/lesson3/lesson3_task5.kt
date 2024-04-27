package lesson3

fun main() {
    val moveInChess = "D2-D4;0"
    val parser = moveInChess.split("-", ";")

    val from = parser[0]
    val to = parser[1]
    val moveNumber = parser[2]

    println(from)
    println(to)
    println(moveNumber)
}