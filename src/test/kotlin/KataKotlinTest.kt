import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KataKotlinTest {

    @Test
    fun testSomething() {
        assertEquals(15, sumPositives(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(13, sumPositives(intArrayOf(1, -2, 3, 4, 5)))
        assertEquals(0, sumPositives(intArrayOf()))
        assertEquals(0, sumPositives(intArrayOf(-1, -2, -3, -4, -5)))
        assertEquals(9, sumPositives(intArrayOf(-1, 2, 3, 4, -5)))
    }
}