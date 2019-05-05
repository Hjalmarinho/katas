
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class KataKotlinTest {

    @Test
    fun sumPositives() {
        assertEquals(15, sumPositives(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(13, sumPositives(intArrayOf(1, -2, 3, 4, 5)))
        assertEquals(0, sumPositives(intArrayOf()))
        assertEquals(0, sumPositives(intArrayOf(-1, -2, -3, -4, -5)))
        assertEquals(9, sumPositives(intArrayOf(-1, 2, 3, 4, -5)))
    }

    @Test
    fun reverseLetters () {
        assertEquals("nahsirk", reverseLetters("krishan"))
        assertEquals("nortlu", reverseLetters("ultr53o?n"))
        assertEquals("cba", reverseLetters("ab23c"))
        assertEquals("nahsirk", reverseLetters("krish21an"))
    }

    @Test
    fun numbersToString() {
        assertEquals("67", numberToString(67))
        assertEquals("123", numberToString(123))
        assertEquals("999", numberToString(999))
    }

    @Test
    fun calculateDutyFree() {
        assertEquals(166, howManyBottles(12, 50, 1000))
        assertEquals(294, howManyBottles(17, 10, 500))
        assertEquals(357, howManyBottles(24, 35, 3000))
        assertEquals(60, howManyBottles(377, 40, 9048))
        assertEquals(10, howManyBottles(2479, 51, 13390))
    }

    @Test
    fun calculateHumanCatAndDogYears() {
        assertTrue (calculateHumanCatAndDogYears(1).contentEquals(intArrayOf(1, 15, 15)))
        assertTrue (calculateHumanCatAndDogYears(2).contentEquals(intArrayOf(2, 24, 24)))
        assertTrue (calculateHumanCatAndDogYears(10).contentEquals(intArrayOf(10, 56, 64)))
    }

    @Test
    fun evenOrOdd() {
        assertEquals("Even", evenOrOdd(2))
        assertEquals("Even", evenOrOdd(0))
        assertEquals("Odd", evenOrOdd(7))
        assertEquals("Odd", evenOrOdd(1))
    }

    @Test
    fun areAllNumbersSmallEnough() {
        assertEquals(true, areAllNumbersSmallEnough(intArrayOf(66, 101), 200))
        assertEquals(false, areAllNumbersSmallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100))
        assertEquals(true, areAllNumbersSmallEnough(intArrayOf(101, 45, 75, 105, 99, 107), 107))
        assertEquals(true, areAllNumbersSmallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120))
    }

    @Test
    fun removeSpaces() {
        assertEquals("8j8mBliB8gimjB8B8jlB", removeSpaces("8 j 8   mBliB8g  imjB8B8  jl  B"))
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", removeSpaces("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"))
        assertEquals("8aaaaaddddr", removeSpaces("8aaaaa dddd r     "))
    }

    @Test
    fun countRedBeads() {
        assertEquals(0, countRedBeads(0))
        assertEquals(0, countRedBeads(1))
        assertEquals(4, countRedBeads(3))
        assertEquals(8, countRedBeads(5))
    }

    @Test
    fun findSmallestInt() {
        assertEquals(10, findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
        assertEquals(0, findSmallestInt(listOf()))
    }

    @Test
    fun findMiddleCharacter() {
        assertEquals("es", findMiddleCharacter("test"))
        assertEquals("dd", findMiddleCharacter("middle"))
        assertEquals("t", findMiddleCharacter("testing"))
        assertEquals("A", findMiddleCharacter("A"))
    }

    @Test
    fun predictAgeTest() {
        assertEquals(86, predictAge(65, 60, 75, 55, 60, 63, 64, 45))
        assertEquals(79, predictAge(32, 54, 76, 65, 34, 63, 64, 45))
    }
}