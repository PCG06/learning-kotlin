// Kotlin program to print factorial of a number using recursion

fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    val facto = factorial(num)
    println("Factorial of $num is $facto")

}

fun factorial(num: Int): Long {
    if (num > 1)
        return (num * factorial(num - 1))
    return 1
}
