package roman;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralsTest {

    // Test numbers from 1-9 (single digits)
    @Test
    public void testSingleDigitNumbers() {
        assertEquals("I", RomanNumerals.roman(1));
        assertEquals("II", RomanNumerals.roman(2));
        assertEquals("III", RomanNumerals.roman(3));
        assertEquals("IV", RomanNumerals.roman(4));
        assertEquals("V", RomanNumerals.roman(5));
        assertEquals("VI", RomanNumerals.roman(6));
        assertEquals("VII", RomanNumerals.roman(7));
        assertEquals("VIII", RomanNumerals.roman(8));
        assertEquals("IX", RomanNumerals.roman(9));
    }

    // Test numbers from 10-90 (multiples of ten)
    @Test
    public void testTensNumbers() {
        assertEquals("X", RomanNumerals.roman(10));
        assertEquals("XX", RomanNumerals.roman(20));
        assertEquals("XXX", RomanNumerals.roman(30));
        assertEquals("XL", RomanNumerals.roman(40));
        assertEquals("L", RomanNumerals.roman(50));
        assertEquals("LX", RomanNumerals.roman(60));
        assertEquals("LXX", RomanNumerals.roman(70));
        assertEquals("LXXX", RomanNumerals.roman(80));
        assertEquals("XC", RomanNumerals.roman(90));
    }

    // Test numbers between 10-19 (teens)
    @Test
    public void testTeenNumbers() {
        assertEquals("XI", RomanNumerals.roman(11));
        assertEquals("XII", RomanNumerals.roman(12));
        assertEquals("XIII", RomanNumerals.roman(13));
        assertEquals("XIV", RomanNumerals.roman(14));
        assertEquals("XV", RomanNumerals.roman(15));
        assertEquals("XVI", RomanNumerals.roman(16));
        assertEquals("XVII", RomanNumerals.roman(17));
        assertEquals("XVIII", RomanNumerals.roman(18));
        assertEquals("XIX", RomanNumerals.roman(19));
    }

    // Test mid-range numbers (random selections from 20-99)
    @Test
    public void testMidRangeNumbers() {
        assertEquals("XXIV", RomanNumerals.roman(24));
        assertEquals("XXXV", RomanNumerals.roman(35));
        assertEquals("XLIX", RomanNumerals.roman(49));
        assertEquals("LVIII", RomanNumerals.roman(58));
        assertEquals("LXIX", RomanNumerals.roman(69));
        assertEquals("LXXXVIII", RomanNumerals.roman(88));
    }

    // Test hundreds place numbers (100-900)
    @Test
    public void testHundredsNumbers() {
        assertEquals("C", RomanNumerals.roman(100));
        assertEquals("CC", RomanNumerals.roman(200));
        assertEquals("CCC", RomanNumerals.roman(300));
        assertEquals("CD", RomanNumerals.roman(400));
        assertEquals("D", RomanNumerals.roman(500));
        assertEquals("DC", RomanNumerals.roman(600));
        assertEquals("DCC", RomanNumerals.roman(700));
        assertEquals("DCCC", RomanNumerals.roman(800));
        assertEquals("CM", RomanNumerals.roman(900));
    }

    // Test large mid-range numbers (random selections from 100-999)
    @Test
    public void testLargeMidRangeNumbers() {
        assertEquals("CCLXV", RomanNumerals.roman(265));
        assertEquals("CDXLIV", RomanNumerals.roman(444));
        assertEquals("DLXVI", RomanNumerals.roman(566));
        assertEquals("DCCCXC", RomanNumerals.roman(890));
        assertEquals("CMXCIX", RomanNumerals.roman(999)); // Largest valid number
    }

    // Test edge cases (important numbers)
    @Test
    public void testEdgeCases() {
        assertEquals("XL", RomanNumerals.roman(40));   // Special case for 40
        assertEquals("L", RomanNumerals.roman(50));    // Special case for 50
        assertEquals("C", RomanNumerals.roman(100));   // Smallest valid hundreds number
        assertEquals("D", RomanNumerals.roman(500));   // Special case for 500
        assertEquals("CMXCIX", RomanNumerals.roman(999)); // Largest valid number
    }

    // Test invalid numbers (below range)
    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeLow() {
        RomanNumerals.roman(0); // Roman numerals start from 1
    }

    // Test invalid numbers (above range)
    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeHigh() {
        RomanNumerals.roman(1000); // 1000 is out of range for this implementation
    }
}
