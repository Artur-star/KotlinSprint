package lesson5

import java.time.LocalDate

const val COMING_AGE = 18

fun main() {
    print("Введите ваш год рождения: ")

    val yearBirth = readLine()?.toInt()
    val currentYear = LocalDate.now().year

    if (currentYear - yearBirth!! >= COMING_AGE) println("Показать экран со скрытым контентом")

}