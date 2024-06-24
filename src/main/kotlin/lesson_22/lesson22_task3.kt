package lesson_22

data class Person(val name: String, val age: Int, val gender: String)

fun main() {
    val person = Person("Артур", 29, "male")

    val (name, age, gender) = person

    println("Имя $name")
    println("Возраст $age")
    println("Пол $gender")
}