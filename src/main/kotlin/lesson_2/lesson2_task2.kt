package lesson_2

fun main() {
    val permanentEmployees = 50
    val interns = 30
    val salaryPermanentEmployee = 30_000
    val salaryInterns = 20_000

    val expensesForPermanentEmployees = permanentEmployees * salaryPermanentEmployee

    val expensesForAllEmployees = (permanentEmployees * salaryPermanentEmployee) + (salaryInterns * interns)

    val averageSalary = expensesForAllEmployees / (permanentEmployees + interns)

    println("Расходы на выплату зарплаты постоянных сотрудников составляет $expensesForPermanentEmployees")
    println("Общие расходы по ЗП после прихода стажеров составляет $expensesForAllEmployees")
    println("Средняя ЗП одного сотрудника после устройства стажеров составляет $averageSalary")
}