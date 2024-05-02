package lesson_7

fun main() {
    var password = ""
    val rangeChars = ('a'..'z')
    val rangeNumbers = (1..9)
    for (i in 1..3) {
        val randomChar = rangeChars.random()
        val randomInt = rangeNumbers.random()
        password += "$randomChar$randomInt"
    }
    println(password)
}