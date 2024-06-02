package lesson_15

const val MAX_NUMBER_PASSENGERS_IN_TRUCK = 1
const val MAX_NUMBER_PASSENGERS_IN_PASSENGER_CAR = 3
const val MAX_LOAD_IN_TRUCK = 2

interface Shipping {
    fun loadCargo(cargo: Int, countCargo: MutableList<Int>)
    fun unloadCargo(countCargo: MutableList<Int>)
}

interface PassengerTransportation {
    fun loadPassengers(passenger: Int, listPassengers: MutableList<Int>)
    fun unloadPassengers(listPassengers: MutableList<Int>)
}

interface MovementCars {
    fun move(movement: Boolean) = false
}

class Truck : Shipping, PassengerTransportation, MovementCars {

    override fun loadCargo(cargo: Int, countCargo: MutableList<Int>) {
        if (cargo <= MAX_LOAD_IN_TRUCK) countCargo.add(cargo)
    }

    override fun unloadCargo(countCargo: MutableList<Int>) {
        countCargo.removeLast()
    }

    override fun loadPassengers(passenger: Int, listPassengers: MutableList<Int>) {
        if (passenger <= MAX_NUMBER_PASSENGERS_IN_TRUCK) listPassengers.add(passenger)
    }

    override fun unloadPassengers(listPassengers: MutableList<Int>) {
        listPassengers.removeLast()
    }

    override fun move(movement: Boolean) = movement
}

class PassengerCar : PassengerTransportation, MovementCars {

    override fun loadPassengers(passenger: Int, listPassengers: MutableList<Int>) {
        if (passenger <= MAX_NUMBER_PASSENGERS_IN_PASSENGER_CAR) listPassengers.add(passenger)
    }

    override fun unloadPassengers(listPassengers: MutableList<Int>) {
        listPassengers.removeLast()
    }

    override fun move(movement: Boolean) = movement
}

fun main() {
    //Общее количество перевезенного груза и пассажиров
    val numberPassengersTransported: MutableList<Int> = mutableListOf()
    val numberCargoTransported: MutableList<Int> = mutableListOf()

    //Количество груза и пассажиров при транспортировке в одном автомобиле
    val listPassengers: MutableList<Int> = mutableListOf()
    val countCargo: MutableList<Int> = mutableListOf()

    val kamaz = Truck()

    kamaz.loadCargo(2, countCargo)
    kamaz.loadPassengers(1, listPassengers)
    if (kamaz.move(true)) {
        numberPassengersTransported.addAll(listPassengers)
        kamaz.unloadPassengers(listPassengers)
        numberCargoTransported.addAll(countCargo)
        kamaz.unloadCargo(countCargo)
    }

    val ladaGranta = PassengerCar()

    ladaGranta.loadPassengers(3, listPassengers)
    if (ladaGranta.move(true)) {
        numberPassengersTransported.addAll(listPassengers)
        ladaGranta.unloadPassengers(listPassengers)
    }

    val ladaVesta = PassengerCar()
    ladaVesta.loadPassengers(2, listPassengers)
    if (ladaVesta.move(true)) {
        numberPassengersTransported.addAll(listPassengers)
        ladaVesta.unloadPassengers(listPassengers)
    }

    println("Количество перевезенных пассажиров: ${numberPassengersTransported.sum()}")
    println("Количество перевезенного груза: ${numberCargoTransported.sum()} (тонн)")
}