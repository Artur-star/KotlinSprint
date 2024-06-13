package lesson_19

enum class Category() {
    CLOTHES {
        override fun categoryName(): String = "Одежда"
    },
    OFFICE_SUPPLIES {
        override fun categoryName(): String = "Канцелярские товары"
    },
    OTHER {
        override fun categoryName(): String = "Другое"
    };

    abstract fun categoryName(): String

}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Category,
) {
    fun displaysInformationAboutProduct() {
        println("Наименование товара: $name; id товара: $id; категория товара: ${category.categoryName()}")
    }
}

fun main() {
    val product1 = Product("футболка", 1, Category.CLOTHES)
    val product2 = Product("тетрадь", 2, Category.OFFICE_SUPPLIES)

    product1.displaysInformationAboutProduct()
    product2.displaysInformationAboutProduct()
}