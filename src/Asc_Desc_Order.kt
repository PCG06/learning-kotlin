// Kotlin program to check whether the input ascending, descending, random or equal number order

fun main() {
    print("Enter number of elements: ")
    val n = readLine()!!.toInt()

    val arr = IntArray(n)

    println("Enter the $n elements:")
    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt() // Enter a value, press enter, enter next value
    }
    println("Array: \n${arr.joinToString(" ")}")

    var asc = false
    var des = false

    for (i in 1 until (arr.size - 1)) {
        if (arr[i] > arr[i + 1]) {
            des = true
        } else if (arr[i] < arr[i + 1]) {
            asc = true
        }
    }

    print("Array is in ")
    if (asc && !des) {
        println("ascending order")
    } else if (!asc && des) {
        println("descending order")
    } else if (!asc && !des) {
        println("equal order")
    } else {
        println("random order")
    }
}
