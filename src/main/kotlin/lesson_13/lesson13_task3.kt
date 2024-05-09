package lesson_13

class PhoneDirectory2(
    var name: String,
    var phoneNumber: Long,
    var company: Company?,
) {
    override fun toString(): String {
        return "- name: $name\n- phoneNumber: $phoneNumber\n- company: ${company ?: "<не указано>"}\n"
    }
}

class Company(
    var name: String
)

fun main() {
    val listContact = mutableListOf<PhoneDirectory2>()

    listContact.add(PhoneDirectory2("Artur", 88009997755, null))
    listContact.add(PhoneDirectory2("Artur1", 88009997756, null))
    listContact.add(PhoneDirectory2("Artur2", 88008888888, Company("null")))
    listContact.add(PhoneDirectory2("Artur3", 88007777777, Company("Google")))
    listContact.add(PhoneDirectory2("Artur4", 88005554433, Company("Ozon")))

    println(listContact.map { it.company }.filterNotNull().map { it.name }.filter { it != "null" })
}