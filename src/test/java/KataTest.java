import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void highAndLow() {
        System.out.println("HELLO");
        assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void validPins() {
        assertEquals(true, Kata.validatePin("1234"));
        assertEquals(true, Kata.validatePin("0000"));
        assertEquals(true, Kata.validatePin("1111"));
        assertEquals(true, Kata.validatePin("123456"));
        assertEquals(true, Kata.validatePin("098765"));
        assertEquals(true, Kata.validatePin("000000"));
        assertEquals(true, Kata.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, Kata.validatePin("a234"));
        assertEquals(false, Kata.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, Kata.validatePin("1"));
        assertEquals(false, Kata.validatePin("12"));
        assertEquals(false, Kata.validatePin("123"));
        assertEquals(false, Kata.validatePin("12345"));
        assertEquals(false, Kata.validatePin("1234567"));
        assertEquals(false, Kata.validatePin("-1234"));
        assertEquals(false, Kata.validatePin("1.234"));
        assertEquals(false, Kata.validatePin("00000000"));
    }
}