package lesson_21

import java.io.File

fun File.writeInFile(word: String) {
    val lowercaseWord = word.lowercase()
    if (!startsWith(lowercaseWord)) {
        writeText(lowercaseWord)
    } else writeText(lowercaseWord)
}

fun main() {
    val file = File("example21_4.txt")

    file.appendText("Wine")
    file.writeInFile("Start")
    file.appendText("Menu")
    file.appendText("Price")
}