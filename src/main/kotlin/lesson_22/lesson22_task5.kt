package lesson_22

import java.time.LocalDateTime


data class GalacticGuide(
    val namePlace: String,
    val descriptionPlace: String,
    val dateAndTime: LocalDateTime,
    val distanceInLightYears: Double,
) {}

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Тройная звёздная система в созвездии Центавра",
        LocalDateTime.of(2023, 6, 23, 14, 30),
        4.36
    )

    println("Название галактики: ${alphaCentauri.component1()}")
    println("Описание галактики: ${alphaCentauri.component2()}")
    println("дата и время события: ${alphaCentauri.component3()}")
    println("расстояние места или события от Земли в световых годах: ${alphaCentauri.component4()}")
}