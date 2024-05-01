package lesson_7

fun main() {
    var randomNumber = (1000..9999).random()

    print(
        """
        |Ваш код авторизации $randomNumber
        |Введите код: 
    """.trimMargin()
    )

    var userInput = readln().toInt()

    while (userInput != randomNumber) {
        println("Код введен неверно, повторите попытку\n")
        randomNumber = (1000..9999).random()
        print(
            """
        |Ваш код авторизации $randomNumber
        |Введите код: 
    """.trimMargin()
        )
        userInput = readln().toInt()
    }

    println("Добро пожаловать!")
}