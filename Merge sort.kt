fun <E: Comparable<E>> Array<E>.mergeSort(): Array<E> {
    if (size <= 1) return this

    val middle = size / 2
    val left = copyOfRange(0, middle)
    val right = copyOfRange(middle, size)
    return merge(this, left.mergeSort(), right.mergeSort())
}

private fun <E: Comparable<E>> merge(arr: Array<E>, left: Array<E>, right: Array<E>): Array<E> {
    val leftArrSize = left.size
    val rightArrSize = right.size
    var leftArrIndex = 0
    var rightArrIndex = 0
    var index = 0
    while(leftArrIndex < leftArrSize && rightArrIndex < rightArrSize) {
        if (left[leftArrIndex] <= right[rightArrIndex]) {
            arr[index] = left[leftArrIndex]
            leftArrIndex++
        } else {
            arr[index] = right[rightArrIndex]
            rightArrIndex++
        }
        index++
    }

    while(leftArrIndex < leftArrSize) {
        arr[index] = left[leftArrIndex]
        leftArrIndex++
        index++
    }

    while(rightArrIndex < rightArrSize) {
        arr[index] = right[rightArrIndex]
        rightArrIndex++
        index++
    }
    return arr
}

fun main(args: Array<String>) {
    val nums = arrayOf(2, 12, 89, 23, 76, 43, 12)
    nums.mergeSort()
    println(nums.contentToString())

    val languages = arrayOf("Kotlin", "Java", "C#", "R", "Python", "Scala", "Groovy", "C", "C++")
//    val sortedLanguages = languages.mergeSort()
    println(languages.contentToString())
}