
fun <E: Comparable<E>> Array<E>.selectionSort() {
    val len = size
    for (i in 0 until (len - 1)) {
        var minIndex = i
        for (j in (i + 1) until len) {
            if (this[j] < this[minIndex]) minIndex = j
        }
        this[minIndex] = this[i].also { this[i] = this[minIndex] }
    }
}

fun <E: Comparable<E>> List<E>.selectionSort(): List<E> {
    val len = size
    val resultList = toMutableList()
    for (i in 0 until (len - 1)) {
        var minIndex = i
        for (j in (i + 1) until len) {
            if (resultList[j] < resultList[minIndex]) minIndex = j
        }
        resultList[minIndex] = resultList[i].also { resultList[i] = resultList[minIndex] }
    }
    return resultList
}

fun main(args: Array<String>) {
    println("Sort array of elements")
    val nums = arrayOf(2, 12, 89, 23, 76, 43, 12)
    println("Before sorting array of elements")
    println(nums.contentToString())
    nums.selectionSort()
    println("After sorting array of elements")
    println(nums.contentToString())
    println()
    println("Sort List of elements")
    val nums1 = listOf(2, 12, 89, 23, 76, 43, 12)
    println("Before sorting list of elements")
    println(nums1)
    val result = nums1.selectionSort()
    println("After sorting list of elements")
    println(result)
}