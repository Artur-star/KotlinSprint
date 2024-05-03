package lesson_4

const val SUNNY = true
const val AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val TIME_YEAR = "spring"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidityNow = 20
    val currentTimeOfYear = "winter"

    println(
        "Are the conditions favorable for the growth of legumes now? " +
                "${
                    SUNNY == isSunny && AWNING_OPEN == isAwningOpen &&
                            AIR_HUMIDITY == airHumidityNow && TIME_YEAR == currentTimeOfYear
                }"
    )
}