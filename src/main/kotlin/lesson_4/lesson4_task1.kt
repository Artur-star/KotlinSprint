package lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println(
        "����������� �������� �� �������: " +
                "${TOTAL_TABLES - reservedTablesToday > 0}\n" +
                "����������� �������� �� ������: " +
                "${TOTAL_TABLES - reservedTablesTomorrow > 0}"
    )
}