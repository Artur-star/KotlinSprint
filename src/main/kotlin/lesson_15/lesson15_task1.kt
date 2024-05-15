package lesson_15

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class CrucianCarp(
    val name: String = "карась"
) : Swimming {
    override fun swim() {
        println("$name плавает")
    }
}

class Seagull(
    val name: String = "чайка"
) : Flying {
    override fun fly() {
        println("$name летает")
    }
}

class Duck(
    val name: String = "утка"
) : Flying, Swimming {
    override fun fly() {
        println("$name летает")
    }

    override fun swim() {
        println("$name плавает")
    }
}

fun main() {
    val crucianCarp = CrucianCarp()
    val seagull = Seagull()
    val duck = Duck()

    crucianCarp.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}