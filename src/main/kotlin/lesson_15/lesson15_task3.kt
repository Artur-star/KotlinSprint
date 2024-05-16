package lesson_15

abstract class Person(
    protected val listMessages: MutableList<String> = mutableListOf(),
    val name: String,
) {
    abstract fun readAll()

    abstract fun read(indexMessage: Int): String

    abstract fun write(message: String)

    override fun toString(): String {
        return "Person(name='$name')"
    }
}

class User(
    listMessages: MutableList<String>,
    name: String,
) : Person(listMessages, name) {

    override fun readAll() {
        println(listMessages.joinToString(prefix = "", postfix = "", separator = "; "))
    }

    override fun read(indexMessage: Int): String {
        return listMessages[indexMessage]
    }

    override fun write(message: String) {
        listMessages.add(message)
    }
}

class Administrator(
    listMessages: MutableList<String>,
    private val listUsers: MutableList<User> = mutableListOf(),
    name: String,
) : Person(listMessages, name) {

    fun deleteUsers(removeUser: Int) {
        listUsers.removeAt(removeUser)
    }

    fun addUser(user: User) {
        listUsers.add(user)
    }

    fun deleteMessage(removeMessage: Int) {
        listMessages.removeAt(removeMessage)
    }

    override fun read(indexMessage: Int): String {
        return listMessages[indexMessage]
    }

    override fun readAll() {
        println(listMessages.joinToString(prefix = "", postfix = "", separator = ", "))
    }

    override fun write(message: String) {
        listMessages.add(message)
    }
}

fun main() {
    val listUsers = mutableListOf<User>()
    val listMessages = mutableListOf<String>()

    val userArtur = User(listMessages, "Артур")
    val userIvan = User(listMessages, "Иван")
    val administrator = Administrator(listMessages, listUsers, "Алекс")

    //Администратор добавил пользователей
    administrator.addUser(userArtur)
    administrator.addUser(userIvan)

    //записываем и считываем сообщения пользователей
    userArtur.write("Всем здравствуйте!")

    userIvan.read(listMessages.indexOf("Всем здравствуйте!"))
    userIvan.write("Здравствуй, друг")
    println("Пользователь ${userArtur.name} выводит весь список сообщения")

    //считываем все сообщения
    userArtur.readAll()

    //записывает и удаляет сообщения, а также удаляет пользователя администратор Алекс
    administrator.write("Извините, необходимо удалить сообщение Ивана из чата")
    administrator.deleteMessage(listMessages.indexOf("Здравствуй, друг"))
    administrator.deleteUsers(listUsers.indexOf(userIvan))

    println("\nВесь список сообщений")
    userIvan.readAll()

    //список пользователей
    println("\nВесь список пользователей")
    println(listUsers.joinToString(prefix = "", postfix = "", separator = ", "))
}