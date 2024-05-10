package lesson_10

const val LOGIN = "loginlogin"
const val PASSWORD = "1a2sj6h5nf"

fun main() {
    println(getBasket(authorizeUser("loginlogin", "1a2sj6h5nf")))
}

fun authorizeUser(login: String, password: String): String {
    var token = ""
    if (login == LOGIN && password == PASSWORD) {
        for (i in 0..32) {
            token += ((0..9) + ('a'..'z') + ('A'..'Z')).random().toString()
        }
    }
    return token
}

fun getBasket(token: String?): MutableList<String>? {
    val contentsBasket: MutableList<String> = mutableListOf()
    return if (token!!.isEmpty()) {
        println("Пароль или логин введены неверны")
        contentsBasket.ifEmpty { null }
    } else {
        contentsBasket.add("cоль")
        contentsBasket.add("сахар")
        contentsBasket.add("мука")
        contentsBasket
    }
}