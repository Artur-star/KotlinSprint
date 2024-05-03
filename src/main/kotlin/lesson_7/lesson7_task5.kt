package lesson_7

fun main() {
    val numberRange = 0..9
    val lowercaseCharRange = 'a'..'z'
    val capitalCharRange = 'A'..'Z'
    val minSizePassword = 6
    val password = mutableListOf<String>()
    var enterUser: Int

    do {
        println("Введи длину пароля, пароль должен быть не менее 6 знаков: ")
        enterUser = readln().toInt()
    } while (enterUser < minSizePassword)

    password.add("${numberRange.random()}")
    password.add("${lowercaseCharRange.random()}")
    password.add("${capitalCharRange.random()}")
    for (i in password.size..enterUser) {
        password.add(
            "${numberRange.random()}${lowercaseCharRange.random()}${capitalCharRange.random()}".random().toString()
        )
    }
    val shuffledPassword = password.shuffled()
    println(shuffledPassword)


}