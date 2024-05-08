package lesson_12

const val COEF_CELSIUS_KELVIN = 273.15

class Weather4(_daytimeTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {

    val daytimeTemperature: Int = (_daytimeTemperature + COEF_CELSIUS_KELVIN).toInt()
    val nightTemperature = (_nightTemperature + COEF_CELSIUS_KELVIN).toInt()
    val isRainfall = _isRainfall

    init {
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
    println("Погода сегодня в Цельсиях")
    Weather4(-300, -290, false)
}