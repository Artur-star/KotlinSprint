package lesson_4

fun main() {
    val trainingDay = 2

    println(
        """|Exercises for the hands: ${trainingDay % 2 == 0}
           |Exercises for the press: ${trainingDay % 2 == 0}
           |Exercises for the legs:  ${trainingDay % 2 != 0}
           |Exercises for the back:  ${trainingDay % 2 != 0}
        """.trimMargin()
    )

}