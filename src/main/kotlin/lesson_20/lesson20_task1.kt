package lesson_20

fun main() {
    val printString: (String) -> String = { username: String ->
        "С наступающим Новым Годом, $username!"
    }
    println(printString.invoke("Artur"))
}