package lesson_6

fun main() {
    val loginUser = "User"
    val passwordUser = "Password"

    print("Введите имя пользователя: ")
    var enterLogin = readln()
    print("Введите пароль: ")
    var enterPassword = readln()

    while (enterLogin != loginUser || enterPassword != passwordUser) {
        println("Неверное имя пользователя или пароль.\n")
        print("Введите имя пользователя: ")
        enterLogin = readln()
        print("Введите пароль: ")
        enterPassword = readln()
    }

    println("Авторизация прошла успешно!")
}