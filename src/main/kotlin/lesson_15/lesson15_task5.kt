package lesson_15

const val MAX_NUMBER_PASSENGERS_IN_TRUCK = 1
const val MAX_NUMBER_PASSENGERS_IN_PASSENGER_CAR = 3
const val MAX_LOAD_IN_TRUCK = 2

interface Shipping {
    fun loadCargo(cargo: Int)
    fun unloadCargo()

}

interface PassengerTransportation {
    fun loadPassengers(passenger: Int)
    fun unloadPassengers()
    fun move()
}

class Truck : Shipping, PassengerTransportation {
    var countCargo: Int = 0
    var countPassengers: Int = 0

    override fun loadCargo(cargo: Int) {
        if (cargo <= MAX_LOAD_IN_TRUCK) countCargo = cargo
    }

    override fun unloadCargo() {
        countCargo = 0
    }

    override fun loadPassengers(passenger: Int) {
        if (passenger <= MAX_NUMBER_PASSENGERS_IN_TRUCK) countPassengers = passenger
    }

    override fun unloadPassengers() {
        countPassengers = 0
    }

    override fun move() {
        println("Грузовой автомобиль начал двигаться")
    }
}

class PassengerCar : PassengerTransportation {
    var listPassengers = 0

    override fun loadPassengers(passenger: Int) {
        if (passenger <= MAX_NUMBER_PASSENGERS_IN_PASSENGER_CAR) listPassengers = passenger
    }

    override fun unloadPassengers() {
        listPassengers = 0
    }

    override fun move() {
        println("Легковой автомобиль начал двигаться")
    }

    fun move(movement: Boolean) = movement
}

fun main() {
    val numberPassengersTransported: MutableList<Int> = mutableListOf()
    val numberCargoTransported: MutableList<Int> = mutableListOf()

    val kamaz = Truck()

    kamaz.loadCargo(2)
    kamaz.loadPassengers(1)
    if (kamaz.countPassengers != 0) {
        numberPassengersTransported.add(kamaz.countPassengers)
        kamaz.unloadPassengers()
    }
    if (kamaz.countCargo != 0) {
        numberCargoTransported.add(kamaz.countCargo)
        kamaz.unloadCargo()
    }

    val ladaGranta = PassengerCar()

    ladaGranta.loadPassengers(3)
    if (ladaGranta.listPassengers != 0) {
        numberPassengersTransported.add(ladaGranta.listPassengers)
        ladaGranta.unloadPassengers()
    }

    val ladaVesta = PassengerCar()
    ladaVesta.loadPassengers(2)
    if (ladaVesta.listPassengers != 0) {
        numberPassengersTransported.add(ladaVesta.listPassengers)
        ladaVesta.unloadPassengers()
    }

    println("Количество перевезенных пассажиров: ${numberPassengersTransported.sum()}")
    println("Количество перевезенного груза: ${numberCargoTransported.sum()} (тонн)")
}