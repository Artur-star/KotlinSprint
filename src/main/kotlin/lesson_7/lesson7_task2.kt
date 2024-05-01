package lesson_7

fun main() {
    val range = 1000..9999

    do {
        val randomNumber = range.random()
        print(
            """
        |Ваш код авторизации $randomNumber
        |Введите код: 
    """.trimMargin()
        )
        val userInput = readln().toInt()
        if(userInput != randomNumber) {
            println("Код введен неверно, повторите попытку\n")
        }
    }
    while (userInput != randomNumber)

    println("Добро пожаловать!")
}