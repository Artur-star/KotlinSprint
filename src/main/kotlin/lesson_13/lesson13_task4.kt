package lesson_13

class PhoneDirectory4(
    val name: String,
    val phoneNumber: Long? = null,
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
    } while (readln() == "yes")

    println("Телефонная книга:\n " + listPhoneNumbers.joinToString(prefix = "", postfix = "", separator = ", \n"))
}