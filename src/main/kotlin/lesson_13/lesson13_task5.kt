package lesson_13

class PhoneDirectory5(
    val name: String,
    val phoneNumber: Long,
    val company: Company1? = null,
) {
    override fun toString(): String {
        return "\n- name: $name\n- phoneNumber: $phoneNumber\n- company: ${company?.name}"
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