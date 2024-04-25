package lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println(
        "Доступность столиков на сегодня: " +
                "${TOTAL_TABLES - reservedTablesToday > 0}\n" +
                "Доступность столиков на завтра: " +
                "${TOTAL_TABLES - reservedTablesTomorrow > 0}"
    )
}