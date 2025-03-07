package utils;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringTest {

    // A list of random meaningless strings in alphabetical order.
    @Test
    public void alphabeticalOrder() {
        List<String> words = Arrays.asList("anxjwbpw", "bksydzqo", "czumvtln", "dxpqyfeg");
        assertEquals("anxjwbpw", MinElement.min(words));
    }

    // A list of random meaningless strings in random order.
    @Test
    public void randomOrder() {
        List<String> words = Arrays.asList("zquwoxen", "mfldatpr", "anxjwbpw", "eqgsrykc");
        assertEquals("anxjwbpw", MinElement.min(words));
    }

    // A list of mixed-case meaningless strings.
    @Test
    public void mixedCase() {
        List<String> words = Arrays.asList("BKSYDZQO", "anxjwbpw", "CZXUMVTLN", "dxpqyfeg");
        assertEquals("BKSYDZQO", MinElement.min(words)); // Uppercase letters come first in ASCII ordering
    }

    // A list containing duplicate meaningless strings.
    @Test
    public void duplicateStrings() {
        List<String> words = Arrays.asList("xptloqng", "xptloqng", "xptloqng", "xptloqng");
        assertEquals("xptloqng", MinElement.min(words));
    }

    // A single-element list of a meaningless string.
    @Test
    public void singleString() {
        List<String> words = Arrays.asList("qiwuznvy");
        assertEquals("qiwuznvy", MinElement.min(words));
    }

    // A list of special characters.
    @Test
    public void specialCharacters() {
        List<String> words = Arrays.asList("!hello", "#world", "@test", "$money");
        assertEquals("!hello", MinElement.min(words));
    }

    // A list of strings containing numbers.
    @Test
    public void numbersInStrings() {
        List<String> words = Arrays.asList("10", "2", "30", "4");
        assertEquals("10", MinElement.min(words)); // Lexicographic order, not numerical
    }

    // A list of strings in ascending order.
    @Test
    public void orderedAscending() {
        List<String> words = Arrays.asList("alpha", "beta", "gamma", "zeta");
        assertEquals("alpha", MinElement.min(words));
    }

    // A list of strings in descending order.
    @Test
    public void orderedDescending() {
        List<String> words = Arrays.asList("zeta", "gamma", "beta", "alpha");
        assertEquals("alpha", MinElement.min(words));
    }
}
