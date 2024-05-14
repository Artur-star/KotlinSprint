package lesson_13

const val CREATE_CONTACT = "yes"

class PhoneDirectory4(
    val name: String,
    val phoneNumber: Long,
    val company: Company4? = null,
) {
    override fun toString(): String {
        return "\n- name: $name\n- phoneNumber: ${phoneNumber}\n- company: ${company?.name}"
    }
}

class Company4(
    var name: String? = null
)

fun main() {
    val listPhoneNumbers = mutableListOf<PhoneDirectory4>()

    do {
        print("Введите имя: ")
        val name = readln()
        print("Введите номер телефона: ")
        val number = readln().toLongOrNull()
        print("Введите наименование компании: ")
        val company = readln()
        if (number != null) {
            listPhoneNumbers.add(PhoneDirectory4(name, number, Company4(company)))
        } else println("Введите номер телефона, контакт не попадает в телефонную книгу")
        println("Создать контакт? yes/no")
    } while (readln().equals(CREATE_CONTACT, ignoreCase = true))

    println("Телефонная книга:\n${listPhoneNumbers.joinToString(prefix = "", postfix = "", separator = ", \n")}")
}