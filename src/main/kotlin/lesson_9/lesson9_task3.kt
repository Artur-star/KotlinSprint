package lesson_9

fun main() {
    val listForOneServing = mutableListOf(2, 50, 15)

    print("Введите количество порций: ")
    val userRequest = readln().toInt()

    val totalNumberIngredients = listForOneServing.map { it * userRequest }

    println(
        "На $userRequest порций вам понадобится: " +
                "Яиц – ${totalNumberIngredients[0]}, " +
                "молока – ${totalNumberIngredients[1]}, " +
                "сливочного масла – ${totalNumberIngredients[2]}"
    )
}
