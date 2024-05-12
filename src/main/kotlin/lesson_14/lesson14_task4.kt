package lesson_14

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