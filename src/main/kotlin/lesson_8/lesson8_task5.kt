package lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val countProducts = readln().toInt()
    val arrayIngredients = arrayOfNulls<String>(countProducts)

    print("Вводите продукты по одному: ")
    for (i in 0..<countProducts) {
        arrayIngredients[i] = readln()
    }
    println(arrayIngredients.joinToString())
}