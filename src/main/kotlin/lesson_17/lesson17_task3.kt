package lesson_17

class Folder(_isSecret: Boolean, _name: String, _countFails: Int) {
    val name = _name
        get() {
            return if (isSecret) {
                "Скрытая папка"
            } else field
        }

    val countFails = _countFails
        get() {
            return if (isSecret) {
                0
            } else field
        }
    private val isSecret = _isSecret

}

fun main() {
    val folder = Folder(true, "Docs", 5)
    println("Имя папки: ${folder.name}. Количество файлов в папке: ${folder.countFails}")
}