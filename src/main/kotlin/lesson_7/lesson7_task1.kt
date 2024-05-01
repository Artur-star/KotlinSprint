package lesson_7

fun main() {
    var password = ""
    for (i in 1..3) {
        password += "${('a'..'z').random()}${(1..9).random()}"
    }
    println(password)
}