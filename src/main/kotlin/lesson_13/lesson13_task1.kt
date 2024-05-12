package lesson_13

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: Company1?,
) {
    override fun toString(): String {
        return "PhoneDirectory(name='$name', phoneNumber=$phoneNumber, company=$company)"
    }
}

class Company1

fun main() {
    val phoneDirectory = PhoneDirectory("as", 3232, null)
    println(phoneDirectory.toString())
}