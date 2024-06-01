package lesson_15

const val MAX_NUMBER_PASSENGERS_IN_TRUCK = 1
const val MAX_NUMBER_PASSENGERS_IN_PASSENGER_CAR = 3
const val MAX_LOAD_IN_TRUCK = 2

interface Shipping {
    fun loadCargo(cargo: Int, countCargo: MutableList<Int>)
    fun unloadCargo(cargo: Int, countCargo: MutableList<Int>)
}

interface PassengerTransportation {
    fun loadPassengers(passenger: Int, listPassengers: MutableList<Int>)
    fun unloadPassengers(passenger: Int, listPassengers: MutableList<Int>)
}

interface MovementCars {
    fun move()
}

class Truck(
    var movement: Boolean = false
) : Shipping, PassengerTransportation, MovementCars {

    override fun loadCargo(cargo: Int, countCargo: MutableList<Int>) {
        if (cargo <= MAX_LOAD_IN_TRUCK) {
            countCargo.add(cargo)
        } else countCargo.add(MAX_LOAD_IN_TRUCK)
    }

    override fun unloadCargo(cargo: Int, countCargo: MutableList<Int>) {
        countCargo.remove(cargo)
    }

    override fun loadPassengers(passenger: Int, listPassengers: MutableList<Int>) {
        if (passenger <= MAX_NUMBER_PASSENGERS_IN_TRUCK) {
            listPassengers.add(passenger)
        } else listPassengers.add(MAX_NUMBER_PASSENGERS_IN_TRUCK)
    }

    override fun unloadPassengers(passenger: Int, listPassengers: MutableList<Int>) {
        listPassengers.remove(passenger)
    }

    override fun move() {
        movement = true
    }
}

class PassengerCar(
    var movement: Boolean = false
) : PassengerTransportation, MovementCars {

    override fun loadPassengers(passenger: Int, listPassengers: MutableList<Int>) {
        if (passenger <= MAX_NUMBER_PASSENGERS_IN_PASSENGER_CAR) {
            listPassengers.add(passenger)
        } else listPassengers.add(MAX_NUMBER_PASSENGERS_IN_PASSENGER_CAR)
    }

    override fun unloadPassengers(passenger: Int, listPassengers: MutableList<Int>) {
        listPassengers.remove(passenger)
    }

    override fun move() {
        movement = true
    }
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
    kamaz.move()

    if (kamaz.movement) {
        numberPassengersTransported.addAll(listPassengers)
        kamaz.unloadPassengers(1, listPassengers)
        numberCargoTransported.addAll(countCargo)
        kamaz.unloadCargo(2, countCargo)
    }

    val ladaGranta = PassengerCar()

    ladaGranta.loadPassengers(3, listPassengers)
    ladaGranta.move()
    if (ladaGranta.movement) {
        numberPassengersTransported.addAll(listPassengers)
        ladaGranta.unloadPassengers(3, listPassengers)
    }

    val ladaVesta = PassengerCar()
    ladaVesta.loadPassengers(2, listPassengers)
    ladaVesta.move()
    if (ladaVesta.movement) {
        numberPassengersTransported.addAll(listPassengers)
        ladaVesta.unloadPassengers(2, listPassengers)
    }

    println("Количество перевезенных пассажиров: ${numberPassengersTransported.sum()}")
    println("Количество перевезенного груза: ${numberCargoTransported.sum()} (тонн)")
}