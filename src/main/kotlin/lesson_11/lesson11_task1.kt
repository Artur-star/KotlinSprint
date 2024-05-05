package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String
)

fun main() {
    val user1 = User(id = 1, login = "loginlogin", password = "password", email = "email@ya.ru")
    val user2 = User(id = 2, login = "loglog", password = "password2", email = "email@mail.ru")

    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.email}")
    println("${user2.id}, ${user2.login}, ${user2.password}, ${user2.email}")
}