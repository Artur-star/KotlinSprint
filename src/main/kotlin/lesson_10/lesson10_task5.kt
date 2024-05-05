package lesson_10

const val LOGIN = "loginlogin"
const val PASSWORD = "1a2sj6h5nf"

fun main() {
    println(getBasket(authorizeUser("loginlogin", "12sj6h5nf")))
}

fun authorizeUser(login: String, password: String): String? {
    val tokenList: MutableList<String> = mutableListOf()
    val rangeInt = (0..9)
    val rangeChar = ('a'..'z')
    var token: String? = null
    if (login == LOGIN && password == PASSWORD) {
        tokenList.add(0, "${rangeChar.random()}")
        tokenList.add(1, "${rangeInt.random()}")
        for (i in 2..32) {
            tokenList.add(i, "${rangeChar.random()}${rangeInt.random()}".random().toString())
        }
        token = tokenList.shuffled().joinToString(prefix = "", postfix = "", separator = "")
    }
    return token
}

fun getBasket(token: String?): MutableList<String>? {
    val contentsBasket: MutableList<String> = mutableListOf()
    return if (token == null) {
        println("Пароль или логин введены неверны")
        contentsBasket.ifEmpty { null }
    } else {
        contentsBasket.add("cоль")
        contentsBasket.add("сахар")
        contentsBasket.add("мука")
        contentsBasket
    }
}