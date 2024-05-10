package lesson_13

class PhoneDirectory4(
    val name: String,
    val phoneNumber: Long?,
    val company: Company? = null,
) {
    override fun toString(): String {
        return "\n- name: $name\n- phoneNumber: ${phoneNumber ?: "Введите номер телефона, контакт не попадет в телефонную книгу"}\n- company: ${company?.name}"
    }
}

class Company(
    var name: String
)

fun main() {
    val listBeforeFilteringNumbers = mutableListOf<PhoneDirectory4>()

    listBeforeFilteringNumbers.add(PhoneDirectory4("Artur2", 88008888888, Company("null")))
    listBeforeFilteringNumbers.add(PhoneDirectory4("Artur", null, null))
    listBeforeFilteringNumbers.add(PhoneDirectory4("Artur1", 88009997756, null))
    listBeforeFilteringNumbers.add(PhoneDirectory4("Artur2", 88008888888, Company("null")))
    listBeforeFilteringNumbers.add(PhoneDirectory4("Artur3", null, Company("Google")))
    listBeforeFilteringNumbers.add(PhoneDirectory4("Artur4", 88005554433, Company("Ozon")))

    println(listBeforeFilteringNumbers.filter { it.phoneNumber == null })
    println()

    val listPhoneNumbers = listBeforeFilteringNumbers.filter { it.phoneNumber != null }

    println("Телефонная книга:\n " + listPhoneNumbers)
}