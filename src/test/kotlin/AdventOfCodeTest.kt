import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

class AdventOfCodeTest {
    @Test
    fun `Day 1 - returns correct amount of fuel required given mass`() {
        assertEquals(2, calculateFuelRequired(12))
        assertEquals(2, calculateFuelRequired(14))
        assertEquals(654, calculateFuelRequired(1969))
        assertEquals(33583, calculateFuelRequired(100756))

        println(getTotalFuelRequired())
    }

    private fun getTotalFuelRequired() =
            File("./src/resources/day1.txt").useLines { it.toList() }
                    .map { calculateFuelRequired(it.toInt()) }
                    .sum()

    @Test
    fun `Day 1 - returns correct amount of fuel required given mass and fuel`() {
        assertEquals(2, calculateFuelRequiredForBothMassAndFuel(14))
        assertEquals(966, calculateFuelRequiredForBothMassAndFuel(1969))
        assertEquals(50346, calculateFuelRequiredForBothMassAndFuel(100756))

        println(getTotalFuelRequiredForBothMassAndFuel())
    }

    private fun getTotalFuelRequiredForBothMassAndFuel() =
            File("./src/resources/day1.txt").useLines { it.toList() }
                    .map { calculateFuelRequiredForBothMassAndFuel(it.toInt()) }
                    .sum()
}


