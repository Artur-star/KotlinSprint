package lesson_13

class PhoneDirectory(
    var name: String,
    var phoneNumber: Long,
    var company: String?,
) {
    override fun toString(): String {
        return "PhoneDirectory(name='$name', phoneNumber=$phoneNumber, company=$company)"
    }
}

fun main() {
    val phoneDirectory = PhoneDirectory("as", 3232, null)
    println(phoneDirectory.toString())
}