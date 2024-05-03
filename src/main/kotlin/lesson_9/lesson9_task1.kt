package lesson_9

fun main() {
    val listOfIngredients = listOf("яйцо", "молоко", "соль", "сахар", "масло растительное", "укроп")
    println("В рецепте есть следующие ингредиенты: ")
    for (i in listOfIngredients) {
        println(i)
    }
}