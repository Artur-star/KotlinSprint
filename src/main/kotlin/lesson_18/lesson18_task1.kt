package lesson_18

class Order(
    val id: Int,
) {
    var product: String = ""
    var products: MutableList<String> = mutableListOf()

    fun orderProduct(product: String) {
        println("Заказан товар: $product")
        this.product = product
    }

    fun orderProduct(productList: List<String>) {
        println("Заказаны следующие товары: ${productList.joinToString()}")
        products.addAll(productList)
    }
}

fun main() {
    val order = Order(1)
    order.orderProduct(listOf("Apple", "Banan", "Orange"))
    val order1 = Order(2)
    order1.orderProduct("Chery")
}