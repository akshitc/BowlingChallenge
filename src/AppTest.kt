import org.junit.Assert
import org.junit.Test

class AppTest {

    @Test
    fun testPerfectScore() {
        val input = arrayListOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
        val expectedOutput = arrayListOf(30, 60, 90, 120, 150, 180, 210, 240, 270, 300)
        val actualOutput = calculateScore(input)
        Assert.assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testAllGutterScore() {
        val input = arrayListOf(
            Pair(0, 0),
            Pair(0, 0),
            Pair(0, 0),
            Pair(0, 0),
            Pair(0, 0),
            Pair(0, 0),
            Pair(0, 0),
            Pair(0, 0),
            Pair(0, 0),
            Pair(0, 0)
        )
        val expectedOutput = arrayListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        val actualOutput = calculateScore(input)
        Assert.assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testAllSimilarSpares() {
        val input = arrayListOf(
            Pair(9, 1),
            Pair(9, 1),
            Pair(9, 1),
            Pair(9, 1),
            Pair(9, 1),
            Pair(9, 1),
            Pair(9, 1),
            Pair(9, 1),
            Pair(9, 1),
            Pair(9, 1),
            9
        )
        val expectedOutput = arrayListOf(19, 38, 57, 76, 95, 114, 133, 152, 171, 190)
        val actualOutput = calculateScore(input)
        Assert.assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testAllPossibleSpares() {
        val input = arrayListOf(
            Pair(0, 0),
            Pair(9, 1),
            Pair(8, 2),
            Pair(7, 3),
            Pair(6, 4),
            Pair(5, 5),
            Pair(4, 6),
            Pair(3, 7),
            Pair(2, 8),
            Pair(1, 9),
            10
        )
        val expectedOutput = arrayListOf(0, 18, 35, 51, 66, 80, 93, 105, 116, 136)
        val actualOutput = calculateScore(input)
        Assert.assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testAlternateSparesAndStrikes() {
        val input = arrayListOf(
            Pair(1, 9),
            10,
            Pair(2, 8),
            10,
            Pair(3, 7),
            10,
            Pair(4, 6),
            10,
            Pair(5, 5),
            10,
            Pair(8, 2)
        )
        val expectedOutput = arrayListOf(20, 40, 60, 80, 100, 120, 140, 160, 180, 200)
        val actualOutput = calculateScore(input)
        Assert.assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testNoSparesOrStrikes() {
        val input = arrayListOf(
            Pair(4, 3),
            Pair(6, 2),
            Pair(4, 2),
            Pair(8, 1),
            Pair(4, 5),
            Pair(6, 2),
            Pair(7, 2),
            Pair(9, 0),
            Pair(0, 5),
            Pair(6, 3)
        )
        val expectedOutput = arrayListOf(7, 15, 21, 30, 39, 47, 56, 65, 70, 79)
        val actualOutput = calculateScore(input)
        Assert.assertEquals(expectedOutput, actualOutput)
    }
}