package lesson_12

class Weather() {
    private var daytimeTemperature: Int = 30
    private var nightTemperature: Int = 25
    private var isRainfall: Boolean = false

    fun showWeatherToday(daytimeTemperature: Int, nightTemperature: Int, isRainfall: Boolean) {
        this.daytimeTemperature = daytimeTemperature
        this.nightTemperature = nightTemperature
        this.isRainfall = isRainfall
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
    val weatherToday = Weather()
    val weatherTomorrow = Weather()

    println("Погода сегодня: ")
    weatherToday.showWeatherToday(19, 15, true)
    println("\nПогода завтра: ")
    weatherTomorrow.showWeatherToday(33, 25, false)
}