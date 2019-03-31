import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
}