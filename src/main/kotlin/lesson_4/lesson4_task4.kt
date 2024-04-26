package lesson_4

fun main() {
    var trainingDay = 1
    val hands: Boolean
    val legs: Boolean
    val back: Boolean
    val press: Boolean

    if (trainingDay % 2 == 0) {
        hands = false
        press = false
        legs = true
        back = true
        trainingDay++
    } else {
        hands = true
        press = true
        legs = false
        back = false
        trainingDay++
    }
    println(
        """|Exercises for the hands: $hands
           |Exercises for the press: $press
           |Exercises for the legs: $legs
           |Exercises for the back: $back
        """.trimMargin()
    )

}