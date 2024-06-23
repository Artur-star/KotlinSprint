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

    val (namePlace, descriptionPlace, dateAndTime, distanceInLightYears) = alphaCentauri
    println("Название галактики: $namePlace")
    println("Описание галактики: $descriptionPlace")
    println("дата и время события: $dateAndTime")
    println("расстояние места или события от Земли в световых годах: $distanceInLightYears")
}