package lesson_4

fun main() {
    println("The ship has no damage: ")
    val noDamage = readln().toBoolean()

    println("Number of crew: ")
    val numberCrew = readln().toInt()

    println("Number of boxes: ")
    val numberBoxes = readln().toInt()

    println("weather conditions: ")
    val weatherConditions = readln().toBoolean()

    if (((noDamage && numberCrew in 55..70 && weatherConditions)
                || (!noDamage && numberCrew == 70)) && numberBoxes >= 50
    ) {
        println("Ship can sail")
    } else println("Ship can not sail")
}