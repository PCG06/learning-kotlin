// Kotlin program to check whether a number is even or odd

fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    if (num % 2 == 0) {
        println("Even number")
    } else {
        println("Odd number")
    }
}
