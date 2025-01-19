fun binarySearch(ar: List<Int>, key: Int): Int {
    val arr = ar.sorted()
    var low = 0
    var high = arr.size - 1
    while (low <= high) {
        val middle = (low + high) / 2
        when {
            arr[middle] == key -> return middle
            arr[middle] < key -> low = middle + 1
            else -> high = middle - 1
        }
    }
    return -1
}

fun main() {
    val numbers = listOf(11, 22, 34, 45, 56, 78, 90)
    val key = 45
    println("List: $numbers")
    val result = binarySearch(numbers, key)
    if (result == -1) {
        println("$key is not present in the list.")
    } else {
        println("$key is present at index $result.")
    }
}