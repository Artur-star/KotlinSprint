package lesson_12

import kotlin.random.Random

class Weather5(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val isRainfall: Boolean,
)

fun main() {
    val listDayTemp = mutableListOf<Int>()
    val listNightTemp = mutableListOf<Int>()
    val listIsRainfall = mutableListOf<Boolean>()

    val weatherListForThirtyDays = mutableListOf<Weather5>()
    for (i in 0..<30) {
        weatherListForThirtyDays.add(
            Weather5(
                daytimeTemperature = (20..35).random(),
                nightTemperature = (17..25).random(),
                isRainfall = Random.nextBoolean()
            )
        )
        listDayTemp.add(weatherListForThirtyDays[i].daytimeTemperature)
        listNightTemp.add(weatherListForThirtyDays[i].nightTemperature)
        listIsRainfall.add(weatherListForThirtyDays[i].isRainfall)
    }

    System.out.printf("Средняя температура ночью за 30 дней: %.1f\n", listNightTemp.average())
    System.out.printf("Средняя температура днем за 30 дней: %.1f\n", listDayTemp.average())
    println("Количество дней с осадками: ${listIsRainfall.groupingBy { it }.eachCount()[true]}")
}