package lesson_10

fun main() {
    val login = readln()
    val password = readln()
    if (lengthValidation(login.length) && lengthValidation(password.length)) println("Welcome!")
    else println("The username or password is not long enough")
}

fun lengthValidation(lenght: Int) = lenght > 4