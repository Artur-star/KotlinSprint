package lesson_3

fun main() {
    val timeDay = "evening"
    val username = "�����"
    val outputGreeting = when (timeDay) {
        "afternoon" -> "������ ����!!!"
        "evening" -> "������ �����!!!"
        else -> "Other"
    }
    println(" $username, $outputGreeting")
}