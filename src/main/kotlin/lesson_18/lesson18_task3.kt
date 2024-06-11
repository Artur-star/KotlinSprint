package lesson_18

open class Animal {
    open fun eat(): String = ""
    open fun sleep(): String = ""
}

class Fox(private val name: String) : Animal() {
    override fun eat(): String {
        return "${name} -> berries"
    }

    override fun sleep(): String {
        return "${name} -> sleep"
    }
}

class Dog(private val name: String) : Animal() {
    override fun eat(): String {
        return "${name} -> bones"
    }

    override fun sleep(): String {
        return "${name} -> sleep"
    }
}

class Cat(private val name: String) : Animal() {
    override fun eat(): String {
        return "${name} -> fish"
    }

    override fun sleep(): String {
        return "${name} -> sleep"
    }
}

fun main() {
    val catTommy: Animal = Cat("Tommy")
    val foxNastasia: Animal = Fox("Nastasia")
    val dogAtos: Animal = Dog("Atos")

    val listAnimals: List<Animal> = listOf(catTommy, foxNastasia, dogAtos)

    listAnimals.forEach { println(it.eat()) }
}