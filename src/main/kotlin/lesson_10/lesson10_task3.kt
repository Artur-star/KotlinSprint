package lesson_10

fun main() {
    println(generationPassword(readln().toInt()))
}

fun generationPassword(length: Int): String {
    val rangeOfNumber = (0..9)
    val rangeCharacter = "!\"#\$%&'()*+,-./ "
    val password: MutableList<String> = mutableListOf()
    for (i in 0..length) {
        if (i % 2 == 0) {
            password.add(rangeOfNumber.random().toString())
        } else password.add(rangeCharacter.random().toString())
    }
    return password.joinToString(prefix = "", postfix = "", separator = "")
}