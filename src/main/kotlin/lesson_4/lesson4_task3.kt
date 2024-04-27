package lesson_4

fun main() {
    val weatherToday = true
    val coveringMaterialAtMoment = true
    val airHumidity = 20
    val currentTimeOfYear = "winter"

    println(
        "Are the conditions favorable for the growth of legumes now? " +
                "${weatherToday && coveringMaterialAtMoment && airHumidity == 20 && currentTimeOfYear == "notWinter"}"
    )
}