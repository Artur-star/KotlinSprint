package lesson_2

fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5

    val averageScore: Float = ((student1 + student2 + student3 + student4) / 4)
        .toFloat()

    println(averageScore)
}
