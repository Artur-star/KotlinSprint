package lesson_16

class Order(
    private var id: Int,
    private var status: Boolean,
    ) {

    private fun changeStatus(status: Boolean) {
        this.status = status
    }

    fun changeStatusViaAdministrator(status: Boolean) {
        changeStatus(status)
    }
}