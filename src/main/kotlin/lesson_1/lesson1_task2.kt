package lesson_1

fun main() {
    val countOfOrders: Int = 75
    val textWithThanks: String = "Thank you for your products"
    var countOfEmployees: Int = 2000

    println("Количество заказов - $countOfOrders\n" +
            "Текст благодарностей - $textWithThanks")

//    println("Количество работников - $countOfEmployees")

    countOfEmployees = 1999

    println("Количество работников - $countOfEmployees")
}