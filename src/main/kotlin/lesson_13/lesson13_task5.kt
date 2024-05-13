package lesson_13

class PhoneDirectory5(
    val name: String,
    val phoneNumber: Long? = null,
    val company: Company1? = null,
) {
    override fun toString(): String {
        return "\n- name: $name\n- phoneNumber: ${phoneNumber ?: "Введите номер телефона, контакт не попадет в телефонную книгу"}\n- company: ${company?.name}"
    }
}

class Company1(
    var name: String
)

fun main() {
    println("Введите номер телефона")
    try {
        val inputPhoneNumber = readln().toLong()
        PhoneDirectory5("Артур", inputPhoneNumber, Company1("Yandex"))
    } catch (e: NumberFormatException) {
        println(e)
    }
}