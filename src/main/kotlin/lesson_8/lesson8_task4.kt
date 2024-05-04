package lesson_8

fun main() {
    val listIngredients = arrayOf("соль", "сахар", "молоко", "мука", "яйцо куриное", "растительное масло")

    println("Начальный список ингридиетов: ")
    for (i in listIngredients) {
        print("$i ")
    }

    print("\nКакой ингридиент ты хочешь найти: ")
    val userRequest = readln()

    if (listIngredients.contains(userRequest)) {
        println("Каким ингридиентом ты его хочешь заменить: ")
        listIngredients[listIngredients.indexOf(userRequest)] = readln()
        println("Готово! Вы сохранили следующий список: ")
        for (i in 0..listIngredients.indexOf(listIngredients.max())) {
            println(listIngredients[i])
        }
    } else println("Такого ингредиента в рецепте нет")
}