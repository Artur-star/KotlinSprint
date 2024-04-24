package lesson_3

fun main() {
    val timeDay = "evening"
    val username = "Артур"
    val outputGreeting = when (timeDay) {
        "afternoon" -> "Доброй день!!!"
        "evening" -> "Добрый вечер!!!"
        else -> "Other"
    }
    println(" $username, $outputGreeting")
}