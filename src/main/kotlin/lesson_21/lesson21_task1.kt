package lesson_21

fun String.vowelCount(): Int {
    val vowelsLetters: CharSequence = "eyuioa"
    var count = 0
    for (i in 0 until this.length) {
        if (vowelsLetters.contains(this[i], ignoreCase = true)) {
            count++
        }
    }
    return count
}

fun main() {
    val string = "Hello from program"
    println(string.vowelCount())
}