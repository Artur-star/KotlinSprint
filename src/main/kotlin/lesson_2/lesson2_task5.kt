package lesson_2

import kotlin.math.pow

const val ONE_HUNDRED_PERCENT = 100
const val COEF = 1
const val CHANGING_FRACTIONAL_NUMBER = 1000.0

fun main() {
    val amountCustomer = 70_000
    val interestRate = 16.7
    val depositPeriod = 20

    val amountDeposit = amountCustomer * (COEF + interestRate / ONE_HUNDRED_PERCENT).pow(depositPeriod)
    println((amountDeposit * CHANGING_FRACTIONAL_NUMBER).toInt() / CHANGING_FRACTIONAL_NUMBER)
}