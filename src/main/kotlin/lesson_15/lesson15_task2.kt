package lesson_15

abstract class WeatherStationStats() {
    abstract fun getResult(): String
}

class Temperature(
    val temperature: Int,
) : WeatherStationStats() {
    override fun getResult(): String {
        return "Сегодня $temperature градусов"
    }
}

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats() {
    override fun getResult(): String {
        return "Количество осадков сегодня $precipitationAmount мм"
    }
}

class WeatherServer() {
    fun sendMessageOnServer(temperature: Temperature): Temperature {
        return temperature
    }

    fun sendMessageOnServer(precipitationAmount: PrecipitationAmount): PrecipitationAmount {
        return precipitationAmount
    }
}

fun main() {
    val temperature = Temperature(35)
    val precipitationAmount = PrecipitationAmount(40)

    val weatherServer = WeatherServer()
    println(weatherServer.sendMessageOnServer(temperature))
    println(weatherServer.sendMessageOnServer(precipitationAmount))

}