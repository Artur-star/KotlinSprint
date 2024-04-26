package lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    var cargoWeight = 20
    var cargoVolume = 80

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
                "${(cargoWeight >= minWeight && cargoWeight <= maxWeight) && cargoVolume < maxVolume}"
    )

    cargoWeight = 50
    cargoVolume = 100

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
                "${(cargoWeight >= minWeight && cargoWeight <= maxWeight) && cargoVolume < maxVolume}"
    )
}