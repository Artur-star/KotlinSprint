package lesson_12

import java.util.Random

val LIST_DAY_TIME_TEMP = mutableListOf<Int>()
val LIST_NIGHT_TEMP = mutableListOf<Int>()
val LIST_IS_RAINFALL = mutableListOf<Boolean>()

class Weather5(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val isRainfall: Boolean,
) {

    init {
        createListForEachField()
    }

    private fun createListForEachField() {
        LIST_IS_RAINFALL.add(isRainfall)
        LIST_DAY_TIME_TEMP.add(daytimeTemperature)
        LIST_NIGHT_TEMP.add(nightTemperature)
    }

    companion object {
        fun calculateAverageTemperatures() {
            System.out.printf("Средняя температура ночью за 30 дней: %.1f\n", LIST_NIGHT_TEMP.average())
            System.out.printf("Средняя температура днем за 30 дней: %.1f\n", LIST_DAY_TIME_TEMP.average())
            println("Количество дней с осадками: ${LIST_IS_RAINFALL.groupingBy { it }.eachCount()[true]}")
        }
    }
}

fun main() {
    val mutableListOf = mutableListOf<Weather5>()
    for (i in 0..<30) {
        mutableListOf.add(
            Weather5(
                daytimeTemperature = (20..35).random(),
                nightTemperature = (17..25).random(),
                isRainfall = Random().nextBoolean()
            )
        )
    }
    Weather5.calculateAverageTemperatures()
}