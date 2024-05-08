package lesson_12

class Weather2(
    private var daytimeTemperature: Int,
    private var nightTemperature: Int,
    private var isRainfall: Boolean,
) {
    fun showWeatherToday() {
        println(
            """
            Температура днем - ${daytimeTemperature}
            Температура ночью - ${nightTemperature}
            Осадки - ${isRainfall}
        """.trimIndent()
        )
    }
}

fun main() {
    val weatherToday = Weather2(39, 27, false)
    println("Погода сегодня")
    weatherToday.showWeatherToday()
}