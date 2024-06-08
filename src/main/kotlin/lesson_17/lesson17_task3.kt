package lesson_17

class Folder(val isSecret: Boolean, name: String, countFails: Int) {
    val name = name
        get() {
            return if (isSecret) {
                "Скрытая папка"
            } else field
        }

    val countFails = countFails
        get() {
            return if (isSecret) {
                0
            } else field
        }
}

fun main() {
    val folder = Folder(true, "Docs", 5)
    println("Имя папки: ${folder.name}. Количество файлов в папке: ${folder.countFails}")
}