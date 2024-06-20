package lesson_20

fun main() {
    val listString: List<String> = listOf("element 0", "element 1", "element 2", "element 3", "element 4", "element 5")

    val map = listString.map { it: String -> { "Нажат элемент $it" } }

    for (i in 0 until map.size) {
        if (i % 2 == 0) {
            println(map[i].invoke())
        }
    }
}