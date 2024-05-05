package lesson_9

fun main() {
    println("Напиши 5 ингридиентов, каждый с нового запроса: ")
    val setIngredients = mutableSetOf<String>()
    var requestUser: String
    while (setIngredients.size != 5) {
        requestUser = readln()
        if (requestUser.isNotEmpty()) {
            if(!setIngredients.add(requestUser)) {
                println("Такой продукт уже был")
            }
        } else println("Вы ввели пустую строку")
    }
    val sortedIngredients = setIngredients.sorted().toMutableList()
    println(sortedIngredients.joinToString().replaceFirstChar { it.uppercase() })
}