package lesson_7

fun main() {

    val numberRange = 0..9
    val lowercaseCharRange = 'a'..'z'
    val capitalCharRange = 'A'..'Z'
    val minSizePassword = 6
    var password = ""
    var enterUser: Int
    do {
        println("Введи длину пароля, пароль должен быть не менее 6 знаков: ")
        enterUser = readln().toInt()
    } while (enterUser < minSizePassword)

    for (i in 1..enterUser) {
        password += "${numberRange.random()}${lowercaseCharRange.random()}${capitalCharRange.random()}".random()
    }
    println(password)
}