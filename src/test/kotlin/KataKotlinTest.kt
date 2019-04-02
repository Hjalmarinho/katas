
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
}