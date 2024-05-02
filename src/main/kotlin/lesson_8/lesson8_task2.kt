package lesson_8

fun main() {
    val listIngredients = arrayOf("соль", "сахар", "молоко", "мука", "яйцо куриное", "растительное масло")
    println("Какой ингридиент ты хочешь найти: ")
    val userRequest = readln()
    var ingredient = ""

    for (i in listIngredients) {
        if (i == userRequest) {
            ingredient = i
            break
        }
    }
    if (ingredient.isNotEmpty()) println("Ингредиент '${userRequest.trim()}' в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}