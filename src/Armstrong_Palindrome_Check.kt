// Kotlin program to create a choice menu with Armstrong and Palindrome number options

fun main() {
    while (true) {
        println("---Menu---")
        println("1. Armstrong")
        println("2. Palindrome")
        println("3. Exit")
        print("Enter a choice: ")
        val ch = readLine()!!.toInt()
        if (ch == 1) { // Armstrong
            print("\nEnter a number: ")
            val num = readLine()!!.toInt()
            var temp = num
            var sum = 0
            while (temp > 0) {
                val rem: Int = temp % 10
                sum = sum + (rem * rem * rem)
                temp /= 10
            }
            if (num == sum) {
                println("It is an Armstrong number\n")
            } else {
                println("It is not an Armstrong number\n")
            }
        } else if (ch == 2) {
            print("\nEnter a number: ")
            val num = readLine()!!.toInt()
            var temp = num
            var rev = 0
            while (temp > 0) {
                val rem: Int = temp % 10
                rev = rev * 10 + rem
                temp /= 10
            }
            if (num == rev) {
                println("It is a palindrome number\n")
            } else {
                println("It is not a palindrome number\n")
            }
        }
        else if (ch == 3) {
            println("Exiting...")
            break
        }
        else {
            println("Invalid choice!")
        }
    }
}
