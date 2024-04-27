package lesson5

fun main() {
    val numberOne = 39
    val numberTwo = 15

    print("Введите два числа от 0 до 42: ")
    val firstNumberUser = readLine()?.toInt()
    val secondNumberUser = readLine()?.toInt()

    if ((firstNumberUser == numberOne || firstNumberUser == numberTwo) &&
        (secondNumberUser == numberOne || secondNumberUser == numberTwo)
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((firstNumberUser == numberOne || firstNumberUser == numberTwo) ||
        (secondNumberUser == numberOne || secondNumberUser == numberTwo)
    )
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Чтобы победить, нужно было ввести числа $numberOne и $numberTwo")
}