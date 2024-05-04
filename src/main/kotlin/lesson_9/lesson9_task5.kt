package lesson_9

fun main() {
    println("Напиши 5 ингридиентов, каждый с нового запроса: ")
    val setIngredients = mutableSetOf<String>()
    var requestUser: String
    while (setIngredients.size != 5) {
        requestUser = readln()
        if (requestUser in setIngredients) {
            println("Такой продукт уже был")
        }
        setIngredients.add(requestUser)
    }
    val sortedIngredients = setIngredients.sorted().toMutableList()
    sortedIngredients[0] = sortedIngredients[0].replaceFirstChar { it.uppercase() }
    println(sortedIngredients.joinToString())
}