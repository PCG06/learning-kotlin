// Kotlin program to create a class Pay to calculate and display salary of a person

class Pay(val name: String, val salary: Double) {
    var da = 0.0
    var hra = 0.0
    var pf = 0.0
    var gross = 0.0
    var net = 0.0

    fun calculate() {
        da = salary * 0.15
        hra = salary * 0.10
        pf = salary * 0.12
        gross = salary + da + hra
        net = gross - pf
    }

    fun display() {
        println("-----------------")
        println("Name: $name")
        println("Salary: $salary")
        println("DA: $da")
        println("HRA: $hra")
        println("PF: $pf")
        println("Gross salary: $gross")
        println("Net salary: $net")
    }
}

fun main() {
    print("Enter your name: ")
    val name = readLine()!!
    print("Enter salary: ")
    val salary = readLine()!!.toDouble()

    val p = Pay(name, salary)
    p.calculate()
    p.display()
}
