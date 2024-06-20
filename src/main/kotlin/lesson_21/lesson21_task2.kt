package lesson_21

fun main() {
    fun List<Int>.evenNumbersSum(): Int {
        var sum = 0
        for (i in 0 until size) {
            if (this[i] % 2 == 0) {
                sum += this[i]
            }
        }
        return sum
    }

    val listInt = listOf(1, 2, 8)
    println(listInt.evenNumbersSum())
}