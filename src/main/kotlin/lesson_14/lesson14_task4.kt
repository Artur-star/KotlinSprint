package lesson_14

open class CelestialObject(
    val name: String,
    val isAtmosphere: Boolean,
    val isSuitableForDisembarkation: Boolean,
)

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isSuitableForDisembarkation: Boolean,
) : CelestialObject(name, isAtmosphere, isSuitableForDisembarkation)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isSuitableForDisembarkation: Boolean,
    val listSatellites: MutableList<Satellite> = mutableListOf(),
) : CelestialObject(name, isAtmosphere, isSuitableForDisembarkation)

fun main() {
    val satellitePhobos = Satellite("Фобос", false, false)
    val satelliteDeimos = Satellite("Деймос", false, false)
    val listSatellites: MutableList<Satellite> = mutableListOf()
    val planetMars = Planet("Марс", true, false,
        listSatellites.apply {
            add(satelliteDeimos)
            add(satellitePhobos)
        })
    with(planetMars) {
        println("Планета ${this.name}. Ее спутники: ${this.listSatellites.map { it.name }}")
    }
}