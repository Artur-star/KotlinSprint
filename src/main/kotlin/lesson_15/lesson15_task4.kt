package lesson_15

interface Searching {
    fun search(accessoriesForInstruments: AccessoriesForInstruments)
}

abstract class Product(
    val name: String,
    val count: Int,
)

class MusicalInstrument(
    name: String,
    count: Int,
) : Product(name, count), Searching {

    override fun search(accessoriesForInstruments: AccessoriesForInstruments) {
        println("Выполняется поиск")
    }
}

class AccessoriesForInstruments(
    name: String,
    count: Int,
) : Product(name, count)

fun main() {
    val accessories = AccessoriesForInstruments("Струна", 10)
    val musicalInstrument = MusicalInstrument("Гитара", 6)
    musicalInstrument.search(accessories)
}