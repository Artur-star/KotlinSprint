package lesson_8

fun main() {
    val arrayNumberAds = arrayOf(10, 14, 5, 34, 65, 34, 65)
    var weeklyViews: Int = 0
    for (i in arrayNumberAds) {
        weeklyViews += i
    }
    println(weeklyViews)
}