package lesson_1

const val TRANSFER_OF_UNITS = 60

fun main() {
    val numberOfSecondsInSpace = 6480
    val numberOfMinutesInSpace = numberOfSecondsInSpace / TRANSFER_OF_UNITS
    val remainingMinutes = numberOfMinutesInSpace % TRANSFER_OF_UNITS
    val numberOfHoursInSpace = numberOfMinutesInSpace / TRANSFER_OF_UNITS
    val remainingSeconds = numberOfSecondsInSpace % TRANSFER_OF_UNITS

    val timeInSpace = String.format("0%d:%d:0%d", numberOfHoursInSpace, remainingMinutes, remainingSeconds)

    println(timeInSpace)
}

