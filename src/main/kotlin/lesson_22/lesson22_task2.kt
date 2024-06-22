package lesson_22

class RegularBook1(
    val name: String,
    val author: String,
)

data class DataBook1(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook = RegularBook1("Война и мир", "Л. Толстой")
    val dataBook = DataBook1("Мастер и Маргарита", "М. Булгаков")

    println(regularBook.toString()) //функции toString() выводит наименование пакета.имя класса.хэш-код
    println(dataBook.toString()) //функции toString() выводит все свойства объекта
}