package lesson_9

fun main() {
    println("Перечисли 5 ингридиентов через запятую с пробелом: ")
    println(readln().split(", ").sorted().joinToString())
}