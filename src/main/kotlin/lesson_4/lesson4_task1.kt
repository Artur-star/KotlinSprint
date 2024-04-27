package lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println(
        "Availability of tables for today: " +
                "${TOTAL_TABLES - reservedTablesToday > 0}\n" +
                "Availability of tables for tomorrow: " +
                "${TOTAL_TABLES - reservedTablesTomorrow > 0}"
    )
}