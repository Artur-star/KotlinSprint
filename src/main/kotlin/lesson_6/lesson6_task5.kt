package lesson_6

fun main() {
    var randomNumberOne = (1..9).random()
    var randomNumberTwo = (1..9).random()

    for (i in 1..3) {
        val exampleMath = randomNumberOne + randomNumberTwo
        println(
            """
            Solve the example: $randomNumberOne + $randomNumberTwo
            Your answer: 
        """.trimIndent()
        )
        val answerUser = readln().toInt()
        if (answerUser == exampleMath) {
            println("Welcome!")
            break
        }
        if (i == 3) {
            println("Access is denied!")
        }
        randomNumberOne = (1..9).random()
        randomNumberTwo = (1..9).random()
    }
}