package roman;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralsTest {

    // Single-digit numbers (1-9)
    @Test
    public void testSingleDigits() {
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

    // Multiples of ten (10-90)
    @Test
    public void testMultiplesOfTen() {
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

    // Numbers between 11-19 (teens)
    @Test
    public void testTeens() {
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

    // Random numbers between 20-99
    @Test
    public void testMidRangeNumbers() {
        assertEquals("XXIV", RomanNumerals.roman(24));
        assertEquals("XLIX", RomanNumerals.roman(49));
        assertEquals("LXXXVIII", RomanNumerals.roman(88));
        assertEquals("XCIX", RomanNumerals.roman(99));
    }

    // Edge cases (minimum & maximum supported values)
    @Test
    public void testEdgeCases() {
        assertEquals("I", RomanNumerals.roman(1));    // Smallest valid number
        assertEquals("XCIX", RomanNumerals.roman(99)); // Largest valid number
    }

    // Invalid numbers (out of range)
    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeLow() {
        RomanNumerals.roman(0); // Should throw an exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeHigh() {
        RomanNumerals.roman(100); // Should throw an exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeNegative() {
        RomanNumerals.roman(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeAboveHundred() {
        RomanNumerals.roman(101);
    }
}