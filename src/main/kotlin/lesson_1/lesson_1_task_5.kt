package lesson_1

import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main() {
    val numberOfSecondsInSpace = 6480
    val numberOfMinutesInSpace = numberOfSecondsInSpace / 60
    val remainingMinutes = numberOfMinutesInSpace % 60
    val numberOfHoursInSpace = numberOfMinutesInSpace / 60
    val remainingSeconds = numberOfSecondsInSpace % 60

    val timeInSpace = LocalTime.of(numberOfHoursInSpace, remainingMinutes, remainingSeconds).format(DateTimeFormatter.ISO_LOCAL_TIME)

    println(timeInSpace)
}

