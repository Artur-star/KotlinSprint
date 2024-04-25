package lesson_2

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val buffPercentage = 20
    val crystalOreWithoutBuff = 7
    val ironOreWithoutBuff = 11

    val oreCrystalFromBuff = crystalOreWithoutBuff * buffPercentage / ONE_HUNDRED_PERCENT
    println(oreCrystalFromBuff)

    val oreIronFromBuff = ironOreWithoutBuff * buffPercentage / ONE_HUNDRED_PERCENT
    println(oreIronFromBuff)
}