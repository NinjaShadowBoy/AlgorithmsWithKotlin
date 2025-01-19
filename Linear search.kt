fun linearSearch(arr: List<Int>, key: Int): Int {
    for (index in arr.indices) {
        if (arr[index] == key) return index
    }
    return -1
}
fun main() {
    val numbers = listOf(64, 34, 25, 12, 22, 11, 90)
    val key = 22
    println("List: $numbers")
    val result = linearSearch(numbers, key)
    if (result == -1) {
        println("$key is not present in the list.")
    } else {
        println("$key is present at index $result.")
    }
}