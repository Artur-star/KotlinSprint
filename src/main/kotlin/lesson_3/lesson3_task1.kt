package lesson_3

fun main() {
    val timeDay = "evening"
    val username = "Artur"
    val outputGreeting = when (timeDay) {
        "afternoon" -> "Good afternoon!!!"
        "evening" -> "Good evening!!!"
        else -> "Other"
    }
    println(" $username, $outputGreeting")
}