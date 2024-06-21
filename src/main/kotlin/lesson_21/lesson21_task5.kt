package lesson_21

fun Map<String, Int>.maxCategory(): String {
    val maxElementFromCategory = maxBy { it.value }
    val listPoints: MutableList<String> = mutableListOf()
    for (i in 0 until size) {
        if (maxElementFromCategory.value == values.elementAt(i)) {
            listPoints.add(keys.elementAt(i))
        }
    }
    return listPoints.random()
}

fun main() {
    val mapHeroes: MutableMap<String, Int> =
        mutableMapOf(Pair("Art", 300), Pair("Eva", 300), Pair("Kan", 90), Pair("Zag", 80))

    println(mapHeroes.maxCategory())
}