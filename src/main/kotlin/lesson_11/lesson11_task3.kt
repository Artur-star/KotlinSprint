package lesson_11

class Room(
    val cover: String,
    val name: String,
    val listParticipants: MutableList<Participant>,
) {
    fun addParticipant(participant: Participant) {
        listParticipants.add(participant)
    }

    fun updateStatus(nickname: String, _badge: Badge) {
        for (i in listParticipants) {
            if (nickname == i.nickname) {
                i.badge = _badge
            }
        }
    }

    fun outputInformation(participant: Participant) {
        println("Nickname - ${participant.nickname}, Speaker's status - ${participant.badge}")
    }
}

data class Participant(
    val nickname: String,
    var badge: Badge,
)

enum class Badge() {
    TALKING,
    MICROPHONE_TURNED_OFF,
    USER_MUTED,
}

fun main() {
    val user1 = Participant("Bob", Badge.USER_MUTED)
    val user2 = Participant("Pit", Badge.TALKING)
    val user3 = Participant("David", Badge.MICROPHONE_TURNED_OFF)

    val room1 = Room("cover1", "name1", mutableListOf(user1, user2))
    room1.addParticipant(user3)

    println(room1.listParticipants.joinToString())

    room1.updateStatus("Pit", Badge.USER_MUTED)
    room1.outputInformation(user2)
}