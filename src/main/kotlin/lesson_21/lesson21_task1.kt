package lesson_21

fun String.vowelCount(): Int {
    val vowelsLetters: CharSequence = "eyuioa"
    return count { vowelsLetters.contains(it) }
}

fun main() {
    val string = "Hello from program"
    println(string.vowelCount())
}