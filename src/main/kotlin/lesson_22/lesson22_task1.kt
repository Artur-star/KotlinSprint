package lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)
fun main() {
    val regularBook = RegularBook("Война и мир", "Л. Толстой")
    val regularBook1 = RegularBook("Война и мир", "Л. Толстой")

    val dataBook = DataBook("Мастер и Маргарита", "М. Булгаков")
    val dataBook1 = DataBook("Мастер и Маргарита", "М. Булгаков")

    println(regularBook.equals(regularBook1)) //метод equals() сравнивает ссылки на объект, т.е. сравнивает их названия и хэши
    println(dataBook.equals(dataBook1)) // метод equals() сравнивает внутреннее состояние объекта, т.е. их свойства и если свойства абсолютно одинаковые, то и хэши будут одинаковыми
}