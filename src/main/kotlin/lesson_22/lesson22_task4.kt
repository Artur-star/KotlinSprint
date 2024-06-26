package lesson_22

class ViewModel {
    private val data = ""
    private val mainScreenState: MainScreenState = MainScreenState(data)

    data class MainScreenState(
        var data: String,
        var isLoading: Boolean = false,
    )

    fun loadData(data: String): MainScreenState {
        val state = mainScreenState.copy(isLoading = true)
        mainScreenState.data = data
        mainScreenState.isLoading = false
        return state
    }

    fun loadData(): MainScreenState {
        return mainScreenState
    }
}

fun main() {
    val viewModel = ViewModel()

    println("Отсутствие данных: ${viewModel.loadData()}")
    println("Идет загрузка: ${viewModel.loadData("Загрузили данные")}")
    println("Данные загружены: ${viewModel.loadData()}")

}

