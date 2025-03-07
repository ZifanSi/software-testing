package utils;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringTest {

    // Test min() with a list of random meaningless strings in alphabetical order.
    @Test
    public void alphabeticalOrder() {
        List<String> words = Arrays.asList("anxjwbpw", "bksydzqo", "czumvtln", "dxpqyfeg");
        assertEquals("anxjwbpw", MinElement.min(words));
    }

    // Test min() with a list of random meaningless strings in random order.
    @Test
    public void randomOrder() {
        List<String> words = Arrays.asList("zquwoxen", "mfldatpr", "anxjwbpw", "eqgsrykc");
        assertEquals("anxjwbpw", MinElement.min(words));
    }

    // Test min() with a list of mixed-case meaningless strings.
    @Test
    public void mixedCase() {
        List<String> words = Arrays.asList("BKSYDZQO", "anxjwbpw", "CZXUMVTLN", "dxpqyfeg");
        assertEquals("BKSYDZQO", MinElement.min(words)); // Uppercase letters come first in ASCII ordering
    }

    // Test min() with a list containing duplicate meaningless strings.
    @Test
    public void duplicateStrings() {
        List<String> words = Arrays.asList("xptloqng", "xptloqng", "xptloqng", "xptloqng");
        assertEquals("xptloqng", MinElement.min(words));
    }

    // Test min() with a single-element list of a meaningless string.
    @Test
    public void singleString() {
        List<String> words = Arrays.asList("qiwuznvy");
        assertEquals("qiwuznvy", MinElement.min(words));
    }
}
