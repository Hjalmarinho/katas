import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void highAndLow() {
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

    @Test
    public void validPhoneNumber() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void isIsogram() {
        assertEquals(true, Kata.isIsogram("Dermatoglyphics"));
        assertEquals(true, Kata.isIsogram("isogram"));
        assertEquals(false, Kata.isIsogram("moose"));
        assertEquals(false, Kata.isIsogram("isIsogram"));
        assertEquals(false, Kata.isIsogram("aba"));
        assertEquals(false, Kata.isIsogram("moOse"));
        assertEquals(true, Kata.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Kata.isIsogram(""));
    }

    @Test
    public void getVowelCount() {
        assertEquals(0, Kata.getVowelCount("krt"));
        assertEquals(5, Kata.getVowelCount("abracadabra"));
        assertEquals(4, Kata.getVowelCount("auie"));
        assertEquals(0, Kata.getVowelCount(""));
    }

    @Test
    public void sortWords() {
        assertEquals("Thi1s is2 3a T4est", Kata.sortWordsByContainedNumber("is2 Thi1s T4est 3a"));
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", Kata.sortWordsByContainedNumber("4of Fo1r pe6ople g3ood th5e the2"));
        assertEquals("", Kata.sortWordsByContainedNumber(""));
    }

    @Test
    public void rowSumOddNumbers() {
        assertEquals(64, Kata.rowSumOddNumbers(4));
        assertEquals(1, Kata.rowSumOddNumbers(1));
        assertEquals(74088, Kata.rowSumOddNumbers(42));
    }

    @Test
    public void lengthOfShortestWord() {
        assertEquals(3, Kata.lengthOfShortestWord("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.lengthOfShortestWord("turns out random test cases are easier than writing out basic ones"));
        assertEquals(4, Kata.lengthOfShortestWord("should have different cases"));
        assertEquals(5, Kata.lengthOfShortestWord("Hello"));
    }

    @Test
    public void whoLikesIt() {
        assertEquals("no one likes this", Kata.whoLikesIt());
        assertEquals("Peter likes this", Kata.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Kata.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Kata.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Kata.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    public void orderByWeight() {
        assertEquals("2000 103 123 4444 99", Kata.orderByWeight("103 123 4444 99 2000"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", Kata.orderByWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
