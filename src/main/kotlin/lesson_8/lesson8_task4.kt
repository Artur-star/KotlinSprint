package lesson_8

fun main() {
    val listIngredients = arrayOf("соль", "сахар", "молоко", "мука", "яйцо куриное", "растительное масло")

    println("Начальный список ингридиетов: ")
    for (i in listIngredients) {
        print("$i ")
    }

    print("\nКакой ингридиент ты хочешь найти: ")
    val numberOfIngredient = listIngredients.indexOf(readln())

        if (numberOfIngredient == -1) {
            println("Такого ингредиента в рецепте нет")
        } else {
            println("Каким ингридиентом ты его хочешь заменить: ")
            listIngredients[numberOfIngredient] = readln()
        }
    println("Готово! Вы сохранили следующий список: ")
    println(listIngredients.joinToString())
}