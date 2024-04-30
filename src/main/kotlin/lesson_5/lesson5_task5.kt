package lesson_5

fun main() {
    val minNumber = 0
    val maxNumber = 42

    val listRandomNumbers = listOf(
        (minNumber..maxNumber).random(),
        (minNumber..maxNumber).random(),
        (minNumber..maxNumber).random()
    )
    println("Введите три числа: ")
    val listUserNumbers = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val intersect = listRandomNumbers.intersect(listUserNumbers)
    val sizeCollection = intersect.size

    when (sizeCollection) {
        3 -> println("Ты угадал все числа и выиграл джекпот!!!")
        2 -> println("Ты угадал два числа и получает крупный приз!")
        1 -> println("Ты угадал одно число и получаешь утешительный приз")
        else -> println("К сожалению угаданных чисел нет")
    }

    println("Выигрышными числа были: $listRandomNumbers")
}