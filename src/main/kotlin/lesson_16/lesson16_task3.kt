package lesson_16

class User(
    val login: String,
    private val password: String,
) {
    fun checkValidation(password: String) = this.password == password
}

fun main() {
    val user = User("Alexander", "1245")
    println("Корректно введен пароль? ${user.checkValidation("12345")}")
}