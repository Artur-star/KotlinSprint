package lesson_20

class Robot(private var phrase: String) {

    fun say() {
        println(phrase)
    }

    fun setModifier(invertString: (String) -> String) {
        phrase = invertString(phrase)
    }
}

fun main() {
    val listPhrase: List<String> =
        listOf("Hello", "How are you?", "What's your name?", "Are you ready to do programming?")
    val invertString: (String) -> String = { originalString: String ->
        originalString.reversed()
    }


    val robot = Robot(listPhrase.random())
    robot.say()
    robot.setModifier(invertString)
    robot.say()
}