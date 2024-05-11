package lesson_13

class PhoneDirectory1(
    val name: String,
    val phoneNumber: Long,
    val company: Company? = null,
) {
    override fun toString(): String {
        return "- name: $name\n- phoneNumber: $phoneNumber\n- company: ${company ?: "<не указано>"}"
    }
}

class Company

fun main() {
    val phoneDirectory = PhoneDirectory1("Alex", 89998887733)
    println(phoneDirectory.toString())
}