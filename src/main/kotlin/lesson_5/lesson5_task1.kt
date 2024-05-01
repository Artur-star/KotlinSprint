package lesson_5

fun main() {
    val firstNumber = 5
    val secondNumber = 6

    print("Чему равно выражение $firstNumber + $secondNumber = ")

    val answerUser = readln().toInt()

    val result = firstNumber + secondNumber

    if (answerUser == result) println("Добро пожаловать!")
    else println("Доступ запрещен")
}