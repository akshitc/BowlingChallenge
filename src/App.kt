fun main(args: Array<String>) {

    // Enter each frame as a Pair<Int, Int>, but if it's a strike just enter 10
    val input = arrayListOf(
        Pair(1, 4),
        Pair(4, 5),
        Pair(6, 4),
        Pair(5, 5),
        10,
        Pair(0, 1),
        Pair(7, 3),
        Pair(6, 4),
        10,
        Pair(2, 8),
        6
    )
    print(calculateScore(input))
}

fun calculateScore(input: ArrayList<*>): ArrayList<Int> {
    val output = arrayListOf<Int>()
    var sum = 0

    for (i in 0..9) {
        val frame = input[i]

        if (frame is Pair<*, *>) {
            var frameSum = frame.first as Int + frame.second as Int
            if (frameSum == 10) {
                frameSum += handleSpare(input[i + 1])
            }
            sum += frameSum
        } else {
            sum += 10 + handleStrike(i, input)
        }

        output.add(sum)
    }

    return output
}

private fun handleStrike(index: Int, input: ArrayList<*>): Int {
    val frame = input[index + 1]
    if (frame is Pair<*, *>) {
        return frame.first as Int + frame.second as Int
    } else {
        return frame as Int + handleSpare(input[index + 2])
    }
}

private fun handleSpare(frame: Any): Int {
    if (frame is Pair<*, *>) {
        return frame.first as Int
    } else {
        return frame as Int
    }
}
