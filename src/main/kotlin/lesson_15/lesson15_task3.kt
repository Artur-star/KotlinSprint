package lesson_15

abstract class Person(
    val name: String,
) {
    open fun readAll(listMessages: MutableList<String>) {
        println(listMessages.joinToString(prefix = "", postfix = "", separator = "; "))
    }

    open fun read(indexMessage: Int, listMessages: MutableList<String>): String {
        return listMessages[indexMessage]
    }

    open fun write(message: String, listMessages: MutableList<String>) {
        listMessages.add(message)
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }
}

class User(
    name: String,
) : Person(name)

class Administrator(
    name: String,
) : Person(name) {

    fun deleteUsers(removeUser: Int, listUsers: MutableList<User>) {
        listUsers.removeAt(removeUser)
    }

    fun addUser(user: User, listUsers: MutableList<User>) {
        listUsers.add(user)
    }

    fun deleteMessage(removeMessage: Int, listMessages: MutableList<String>) {
        listMessages.removeAt(removeMessage)
    }
}

fun main() {
    val listUsers = mutableListOf<User>()
    val listMessages = mutableListOf<String>()

    val userArtur = User("Артур")
    val userIvan = User("Иван")
    val administrator = Administrator("Алекс")

    //Администратор добавил пользователей
    administrator.addUser(userArtur, listUsers)
    administrator.addUser(userIvan, listUsers)

    //записываем и считываем сообщения пользователей
    userArtur.write("Всем здравствуйте!", listMessages)

    userIvan.read(listMessages.indexOf("Всем здравствуйте!"), listMessages)
    userIvan.write("Здравствуй, друг", listMessages)
    println("Пользователь ${userArtur.name} выводит весь список сообщения")

    //считываем все сообщения
    userArtur.readAll(listMessages)

    //записывает и удаляет сообщения, а также удаляет пользователя администратор Алекс
    administrator.write(
        "Извините, необходимо удалить сообщение Ивана из чата, а также пользователь Ивана",
        listMessages
    )
    administrator.deleteMessage(listMessages.indexOf("Здравствуй, друг"), listMessages)
    administrator.deleteUsers(listUsers.indexOf(userIvan), listUsers)

    println("\nВесь список сообщений")
    userIvan.readAll(listMessages)

    //список пользователей
    println("\nВесь список пользователей")
    println(listUsers.joinToString(prefix = "", postfix = "", separator = ", "))
}