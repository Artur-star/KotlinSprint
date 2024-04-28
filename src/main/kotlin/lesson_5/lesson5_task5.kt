package lesson_5

fun main() {
    val minNumber = 0
    val maxNumber = 42
    val firstRandomNumber: Int = (minNumber..maxNumber).random()
    val secondRandomNumber: Int = (minNumber..maxNumber).random()
    val threeRandomNumber: Int = (minNumber..maxNumber).random()

    val listRandomNumbers = listOf(firstRandomNumber, secondRandomNumber, threeRandomNumber)
    val listUserNumbers = listOf(readLine()?.toInt(), readLine()?.toInt(), readLine()?.toInt())
    val intersect = listRandomNumbers.intersect(listUserNumbers)

    when (intersect.size) {
        3 -> println("Ты угадал все числа и выиграл джекпот!!!")
        2 -> println("Ты угадал два числа и получает крупный приз!")
        1 -> println("Ты угадал одно число и получаешь утешительный приз")
        else -> println("К сожалению угаданных чисел нет")
    }

    println("Выигрышные чмсла были $listRandomNumbers")
}