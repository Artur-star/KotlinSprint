package lesson_4

fun main() {
    print("The ship has no damage: ")
    val noDamage = readLine().toBoolean()

    print("Number of crew: ")
    val numberCrew = readLine()?.toInt()

    print("Number of boxes: ")
    val numberBoxes = readLine()?.toInt()

    print("weather conditions: ")
    val weatherConditions = readLine().toBoolean()

    if (((noDamage && numberCrew in 55..70 && weatherConditions)
                || (!noDamage && numberCrew == 70)) && numberBoxes!! >= 50) {
        println("Ship can sail")
    } else println("Ship can not sail")
}