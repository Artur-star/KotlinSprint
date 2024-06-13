package lesson_19

enum class Fishes(val nameFish: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок"),
}

fun main() {
    val entries: List<Fishes> = Fishes.entries
    println("Пользователь может добавить в свой аквариум:")
    entries.forEach { println(it.nameFish) }
}