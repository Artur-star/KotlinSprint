package lesson_11

class Category(
    var id: Int,
    var recipes: MutableList<Recipe>,
)

class Recipe(
    var id: Int,
    var name: String,
    var ingredients: MutableList<Ingredient>,
    var amountIngredient: Int,
    var numberServings: Int,
    var favourites: Boolean,
)

class Ingredient(
    var id: Int,
    var name: String,
    var measurement: String,
)