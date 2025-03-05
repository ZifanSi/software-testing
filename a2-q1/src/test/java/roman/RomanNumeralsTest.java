package roman;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralsTest {

    @Test
    public void testSingleDigitNumbers() {
        assertEquals("I", RomanNumerals.roman(1));
        assertEquals("II", RomanNumerals.roman(2));
        assertEquals("III", RomanNumerals.roman(3));
    }

    @Test
    public void testTensNumbers() {
        assertEquals("X", RomanNumerals.roman(10));
        assertEquals("XX", RomanNumerals.roman(20));
        assertEquals("XXX", RomanNumerals.roman(30));
    }
}
