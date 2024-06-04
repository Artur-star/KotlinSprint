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
}

class Truck(
    val countCargo: MutableList<Int>,
    val listPassengers: MutableList<Int>
) : Shipping, PassengerTransportation {

    override fun loadCargo(cargo: Int) {
        if (cargo <= MAX_LOAD_IN_TRUCK) countCargo.add(cargo)
    }

    override fun unloadCargo() {
        countCargo.removeLast()
    }

    override fun loadPassengers(passenger: Int) {
        if (passenger <= MAX_NUMBER_PASSENGERS_IN_TRUCK) listPassengers.add(passenger)
    }

    override fun unloadPassengers() {
        listPassengers.removeLast()
    }

    fun move(movement: Boolean) = movement
}

class PassengerCar(
    val listPassengers: MutableList<Int>
) : PassengerTransportation {

    override fun loadPassengers(passenger: Int) {
        if (passenger <= MAX_NUMBER_PASSENGERS_IN_PASSENGER_CAR) listPassengers.add(passenger)
    }

    override fun unloadPassengers() {
        listPassengers.removeLast()
    }

    fun move(movement: Boolean) = movement
}

fun main() {
    val numberPassengersTransported: MutableList<Int> = mutableListOf()
    val numberCargoTransported: MutableList<Int> = mutableListOf()

    val kamaz = Truck(mutableListOf(), mutableListOf())

    kamaz.loadCargo(2)
    kamaz.loadPassengers(1)
    if (kamaz.move(true)) {
        if (kamaz.listPassengers.isNotEmpty()) {
            numberPassengersTransported.addAll(kamaz.listPassengers)
            kamaz.unloadPassengers()
        }
        if (kamaz.countCargo.isNotEmpty()) {
            numberCargoTransported.addAll(kamaz.countCargo)
            kamaz.unloadCargo()
        }
    }

    val ladaGranta = PassengerCar(mutableListOf())

    ladaGranta.loadPassengers(3)
    if (ladaGranta.move(true) && ladaGranta.listPassengers.isNotEmpty()) {
        numberPassengersTransported.addAll(ladaGranta.listPassengers)
        ladaGranta.unloadPassengers()
    }

    val ladaVesta = PassengerCar(mutableListOf())
    ladaVesta.loadPassengers(2)
    if (ladaVesta.move(true) && ladaVesta.listPassengers.isNotEmpty()) {
        numberPassengersTransported.addAll(ladaVesta.listPassengers)
        ladaVesta.unloadPassengers()
    }

    println("Количество перевезенных пассажиров: ${numberPassengersTransported.sum()}")
    println("Количество перевезенного груза: ${numberCargoTransported.sum()} (тонн)")
}