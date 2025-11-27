// Kotlin program to perform arithmetic operations on 2 numbers using while loop and when case

fun main() {
    println("Enter two numbers:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    while (true) {
        print("Enter the operator (+, -, *, /, %): ")
        val op = readLine()

        if (op.isNullOrEmpty()) {
            println("No operator detected")
            continue
        }
    
        val res: Any = when (op[0]) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            '/' -> {
                if (b != 0)
                    a / b 
                else
                    "Cannot divide by zero"
            }
            '%' -> {
                if (b != 0)
                    a % b 
                else
                    "Cannot modulo by zero"
            }
            else -> "Invalid operator"
        }
        println("Result: $res")

        if (res is String) {
            break
        }
    }
}
