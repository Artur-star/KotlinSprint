package lesson_3

fun main() {
    val name = "Tatyana"
    var surname = "Andreeva"
    val patronymic = "Sergeevna"
    var age = 20

    if(age>22) {
        surname = "Sidorova"
        println("$surname $name $patronymic, $age")
    } else println("$surname $name $patronymic, $age")
}