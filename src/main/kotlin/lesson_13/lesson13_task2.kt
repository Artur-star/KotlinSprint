package lesson_13

class PhoneDirectory1(
    var name: String,
    var phoneNumber: Long,
    var company: String?,
) {
    override fun toString(): String {
        return "- name: $name\n- phoneNumber: $phoneNumber\n- company: ${company ?: "<не указано>"}"
    }
}

fun main() {
    val phoneDirectory = PhoneDirectory1("Alex", 89998887733, null)
    println(phoneDirectory.toString())
}