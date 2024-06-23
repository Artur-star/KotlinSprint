package lesson_22

class ViewModel(val mainScreenState: MainScreenState) {

    data class MainScreenState(
        val data: String,
        var isLoading: Boolean = false,
    )

    fun loadData(isLoading: Boolean): MainScreenState {
        mainScreenState.isLoading = isLoading
        return mainScreenState.copy()
    }

    override fun toString(): String {
        return "ViewModel(mainScreenState=$mainScreenState)"
    }
}

class MainScreenViewModel(
    val viewModel: ViewModel,
) {
    override fun toString(): String {
        return "MainScreenViewModel(viewModel=$viewModel)"
    }
}

fun main() {
    val viewModel = ViewModel(ViewModel.MainScreenState("Отсутствие данных"))
    val viewModel1 = ViewModel(ViewModel.MainScreenState("загрузка данных"))
    val viewModel2 = ViewModel(ViewModel.MainScreenState("Наличие загруженных данных"))

    viewModel.loadData(true)
    viewModel1.loadData(false)
    viewModel2.loadData(true)

    println(MainScreenViewModel(viewModel))
    println(MainScreenViewModel(viewModel1))
    println(MainScreenViewModel(viewModel2))
}

