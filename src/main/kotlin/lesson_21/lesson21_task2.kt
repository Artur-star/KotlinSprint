package lesson_21

fun main() {
    fun List<Int>.evenNumbersSum(): Int {
        return filter { it % 2 == 0 }.sum()
    }

    val listInt = listOf(1, 2, 8, 5, 7)
    println(listInt.evenNumbersSum())
}