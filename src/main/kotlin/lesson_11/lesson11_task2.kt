package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun outputInformation() {
        println("id = $id, login = $login, password = $password, email = $email, bio = $bio")
    }

    fun readBio(info: String) {
        bio = info
    }

    fun changePassword(password: String): Boolean {
        return if (this.password == password) {
            println("Введи новый пароль: ")
            this.password = readln()
            println("Пароль изменен")
            true
        } else {
            println("Пароль введен неверно")
            false
        }
    }
}

fun main() {
    val user1 = User2(id = 1, login = "loginlogin", password = "password", email = "email@ya.ru")
    println("Введи пароль: ")
    if (user1.changePassword(readln())) {
        user1.readBio("Меня зовут Артур, я будущий Android-developer")
    }
    user1.outputInformation()
}