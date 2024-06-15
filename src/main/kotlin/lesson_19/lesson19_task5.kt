package lesson_19

enum class Gender {
    MALE, FEMALE,
}

class Person(val name: String, val gender: Gender)

fun main() {
    println("Введите имя пользователя в формате: Имя Пол")
    println("Пол может быть MALE или FEMALE")

    val persons = mutableListOf<Person>()

    while (persons.size < 5) {
        print("Введите данные человека: ")
        val input: String = readln()
        val parts = input.split(" ")

        if (parts.size != 2) {
            println("Неверный формат ввода. Попробуйте еще раз.")
            continue
        }

        val name = parts[0]
        val genderInput = parts[1].uppercase()

        val gender = try {
            Gender.valueOf(genderInput)
        } catch (e: IllegalArgumentException) {
            println("Неверное значение пола. Допустимые значения: MALE, FEMALE")
            continue
        }

        val person = Person(name, gender)
        persons.add(person)
        println("Человек добавлен: ${person.name}")
    }

    println("\nСписок людей в картотеке:")
    for (person in persons) {
        println(person)
    }
}