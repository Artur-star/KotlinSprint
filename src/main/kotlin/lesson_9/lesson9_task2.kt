package lesson_9

fun main() {
    val listOfIngredients = mutableListOf("соль", "сахар", "мука")

    println("В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString()}")
    println("Желаете добавить еще?")

    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        listOfIngredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString()}")
    }
}