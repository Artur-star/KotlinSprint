package lesson_14

class Chat(
    var id: Int,
    val name: String,

    val listMessage: MutableList<Message> = mutableListOf()
) {
    fun addMessage(message: Message) {
        listMessage.add(message)
    }

    fun addThreadMessage(childMessage: ChildMessage, parentMessageId: Int) {
        listMessage.add(childMessage)
        id = parentMessageId
    }

    fun printChat() {
        val groupBy = listMessage.groupBy { it.id }
        groupBy.forEach { println("ЧАТ \"${this.name.uppercase()}\"") }
        groupBy.forEach { "${it.value.forEach { print("${it.author}: ${it.text};\t") }}" }
    }
}

class Author(
    val name: String
) {
    override fun toString(): String {
        return name
    }
}

class ChildMessage(
    id: Int,
    text: String,
    author: Author,
) : Message(id, text, author) {
    override fun toString(): String {
        return text
    }
}

open class Message(
    val id: Int,
    val text: String,
    val author: Author,
) {
    override fun toString(): String {
        return text
    }
}

fun main() {
    println("Введите название чата ")
    val nameChat = readln()

    println("Введите id чата ")
    val id = readln().toInt()
    val chat = Chat(id, nameChat)

    println("Введите ваше имя ")
    var author = Author(readln())

    println("$author введите сообщение ")
    var message = Message(id, readln(), author)
    chat.addMessage(message)

    println("Введите id чата ")
    var idChildMessage = readln().toInt()

    while (chat.id == idChildMessage) {
        println("Введите ваше имя ")
        author = Author(readln())

        println("$author введите сообщение ")
        message = ChildMessage(idChildMessage, readln(), author)
        chat.addThreadMessage(message, idChildMessage)

        println("Введите id чата ")
        idChildMessage = readln().toInt()
    }
    chat.printChat()
}