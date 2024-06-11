package lesson_17

class User(
    login: String,
    password: String,
) {
    var login = login
        set(value) {
            println("Имя пользователя успешно изменено")
            field = value
        }

    var password = password
        get(): String {
            return "*".repeat(field.length)
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User("Artur", "ArtArt")
    user.password = "OtherPassword"
    user.login = "Alex"

    println("Пользователь ${user.login}, пароль ${user.password}")
}