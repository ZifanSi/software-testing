package utils;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FloatTest {

    // Test min() with a list of positive floats.
    @Test
    public void positiveFloat() {
        List<Float> numbers = Arrays.asList(10.5f, 20.3f, 30.7f, 5.2f);
        assertEquals((Float) 5.2f, MinElement.min(numbers));
    }

    // Test min() with a list of negative floats.
    @Test
    public void negativeFloat() {
        List<Float> numbers = Arrays.asList(-10.1f, -20.4f, -30.6f, -5.9f);
        assertEquals((Float) (-30.6f), MinElement.min(numbers));
    }

    // Test min() with a list of mixed floats.
    @Test
    public void mixedFloat() {
        List<Float> numbers = Arrays.asList(5.5f, -1.2f, 3.3f, -10.8f, 8.9f);
        assertEquals((Float) (-10.8f), MinElement.min(numbers));
    }

    // Test min() with a list of duplicate floats.
    @Test
    public void duplicateFloat() {
        List<Float> numbers = Arrays.asList(4.4f, 4.4f, 4.4f, 4.4f, 4.4f);
        assertEquals((Float) 4.4f, MinElement.min(numbers));
    }

    // Test min() with a single-element list.
    @Test
    public void singleFloat() {
        List<Float> numbers = Arrays.asList(42.42f);
        assertEquals((Float) 42.42f, MinElement.min(numbers));
    }
}
