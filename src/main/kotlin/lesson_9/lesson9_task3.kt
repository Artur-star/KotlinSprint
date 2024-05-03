package lesson_9

fun main() {
    val listForOneServing = mutableListOf(2, 50, 15)

    print("Введите количество порций: ")
    val userRequest = readln().toInt()

    for (i in listForOneServing) {
        listForOneServing[listForOneServing.indexOf(i)] = i * userRequest
    }
    println(
        "На $userRequest порций вам понадобится: " +
                "Яиц – ${listForOneServing[0]}, " +
                "молока – ${listForOneServing[1]}, " +
                "сливочного масла – ${listForOneServing[2]}"
    )
}
