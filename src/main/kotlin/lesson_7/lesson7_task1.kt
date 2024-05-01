package lesson_7

fun main() {
    var password = ""
    var randomChar: Char
    var randomInt: Int
    for (i in 1..3) {
        randomChar = ('a'..'z').random()
        randomInt = (1..9).random()
        password += "$randomChar$randomInt"
    }
    println(password)
}