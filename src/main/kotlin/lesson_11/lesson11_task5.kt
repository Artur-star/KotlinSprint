package lesson_11

class Forum(
    val listUser: MutableList<ForumMember> = mutableListOf(),
    var userId: Int = 0,
) {

    fun createNewUser(userName: String): ForumMember {
        val member = ForumMember(userId++, userName)
        listUser.add(member)
        return member
    }

    fun createNewMessage(authorId: Int): ForumMessage {
        var message = ""
        for (i in listUser) {
            if (authorId == i.userId) {
                println("Пишет ${i.userName}")
                message = readln()
                return ForumMessage(authorId, message)
            }
        }
        return ForumMessage(authorId, "")
    }

    fun printThread(forumMessage: ForumMessage) {
        println("${listUser.get(forumMessage.authorId).userName}: ${forumMessage.message}")
    }
}

class ForumMember(
    var userId: Int,
    var userName: String,
)

class ForumMessage(
    var authorId: Int,
    var message: String,
)

fun main() {
    val forum = Forum()
    val userArtur = forum.createNewUser("Artur")
    val userIvan = forum.createNewUser("Ivan")

    forum.printThread(forum.createNewMessage(userArtur.userId))
    forum.printThread(forum.createNewMessage(userIvan.userId))
    forum.printThread(forum.createNewMessage(userArtur.userId))
    forum.printThread(forum.createNewMessage(userIvan.userId))
}