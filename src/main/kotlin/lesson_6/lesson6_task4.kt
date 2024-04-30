package lesson_6

const val TOTAL_NUMBER_ATTEMPTS = 5
const val MIN_NUMBER = 1
const val MAX_NUMBER = 9

fun main() {
    val intRange = (1..9).random()
    var counter = 0

    println(
        """
        Попытайся угадать число в диапазоне от $MIN_NUMBER до $MAX_NUMBER, у тебя есть $TOTAL_NUMBER_ATTEMPTS попыток.
        Вводите значения: 
    """.trimIndent()
    )
    var enterUser = readln().toInt()
    counter++
    while (intRange != enterUser && counter < TOTAL_NUMBER_ATTEMPTS) {

        println("Неверно, осталось ${TOTAL_NUMBER_ATTEMPTS - counter}")
        counter++
        enterUser = readln().toInt()
        if (intRange == enterUser) {
            println("Это была великолепная игра!")
        }
        if (TOTAL_NUMBER_ATTEMPTS - counter == 0) {
            println("Было загадано число $intRange")
        }
    }
}