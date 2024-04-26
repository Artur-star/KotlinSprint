package lesson_2

const val TRANSFER_OF_UNITS = 60
const val NUMBER_MINUTES_PER_DAY = 1440

fun main() {
    val departureTrain = "9:39"
    val travelTimeInMinutes = 457

    val parse = departureTrain.split(":")
    val toIntHours: Int = parse[0].toInt()
    val toIntMinutes: Int = parse[1].toInt()

    val departureTimeInMinutes = (toIntHours * TRANSFER_OF_UNITS) + toIntMinutes
    val inMinutes = departureTimeInMinutes + travelTimeInMinutes

    val arrivalTimeInMinute: Int =
        if (inMinutes < NUMBER_MINUTES_PER_DAY) inMinutes
        else inMinutes % NUMBER_MINUTES_PER_DAY

    val arrivalHours = arrivalTimeInMinute / TRANSFER_OF_UNITS
    val arrivalMinutes = arrivalTimeInMinute % TRANSFER_OF_UNITS

    println(String.format("%02d:%02d", arrivalHours, arrivalMinutes))

}