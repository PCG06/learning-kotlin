// Kotlin program to accept lower and upper limit for the Fibonacci series and print the series

fun main() {
    println("Enter lower and upper limits:")
    val lwr = readLine()!!.toInt()
    val upr = readLine()!!.toInt()

    if (lwr >= upr) {
        println("Upper limit is too low")
    } else {
        println("The Fibonacci series is:")
        var f1 = 0
        var f2 = 1
        while (f1 < upr) {
            if (f1 >= lwr) {
                print("$f1 ")
            }
            var f3 = f1 + f2
            f1 = f2
            f2 = f3
        }
        println()
    }
}
