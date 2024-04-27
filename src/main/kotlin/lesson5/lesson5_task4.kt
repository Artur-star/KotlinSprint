package lesson5

fun main() {
    print("Введите имя пользователя: ")
    val name = readLine()
    val registeredName = "Zaphod"
    val registeredPassword = "PanGalactic"

    if (name != registeredName) {
        println("Пользователь с таким именем не найден. Мы можем предложить вам зарегистрироваться в нашей системе.")
    } else {
        print("Введите пароль: ")
        val password = readLine()
        if (password == registeredPassword) println("Вы успешно прошли авторизацию")
        else println("Неверно введен пароль")
    }
}