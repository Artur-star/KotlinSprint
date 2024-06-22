package lesson_21

fun Map<String, Int>.maxCategory(): String =
    filter { maxElement -> maxElement.value == maxBy { element -> element.value }.value }.keys.shuffled().first()


fun main() {
    val mapHeroes: MutableMap<String, Int> =
        mutableMapOf(Pair("Art", 300), Pair("Eva", 300), Pair("Kan", 90), Pair("Zag", 80))

    println(mapHeroes.maxCategory())
}