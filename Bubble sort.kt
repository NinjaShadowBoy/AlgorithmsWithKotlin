fun <E: Comparable<E>> Array<E>.bubble() {
    val len = size
    for (i in 0 until (len - 1)) {
        for (j in 0 until (len - i - 1)) {
            if (this[j] > this[j + 1]) {
                this[j] = this[j + 1].also { this[j + 1] = this[j] }
            }
        }
    }
}

fun <E: Comparable<E>> Array<E>.bubbleDesc() {
    val len = size
    for (i in 0 until (len - 1)) {
        for (j in 0 until (len - i - 1)) {
            if (this[j] < this[j + 1]) {
                this[j] = this[j + 1].also { this[j + 1] = this[j] }
            }
        }
    }
}

fun main(args: Array<String>) {
    val nums = arrayOf(2, 12, 89, 23, 76, 43, 12)
    nums.bubble()
    println(nums.contentToString())
    nums.bubbleDesc()
    println(nums.contentToString())
}