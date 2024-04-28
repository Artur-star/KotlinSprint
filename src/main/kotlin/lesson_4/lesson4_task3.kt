package lesson_4

const val SUNNY_WEATHER = true
const val ROOF_OPEN = true
const val AIR_HUMIDITY_REQUIRED = 20
const val TIME_YEAR = "notWinter"

fun main() {
    val weatherToday = true
    val roofOpenNow = true
    val airHumidityNow = 20
    val currentTimeOfYear = "notWinter"

    println(
        "Are the conditions favorable for the growth of legumes now? " +
                "${
                    SUNNY_WEATHER == weatherToday && ROOF_OPEN == roofOpenNow &&
                            AIR_HUMIDITY_REQUIRED == airHumidityNow && TIME_YEAR == currentTimeOfYear
                }"
    )
}