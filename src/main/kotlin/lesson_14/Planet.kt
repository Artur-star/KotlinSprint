package lesson_14

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isSuitableForDisembarkation: Boolean,
    val listSatellites: MutableList<Satellite> = mutableListOf(),
) : CelestialObject(name, isAtmosphere, isSuitableForDisembarkation)