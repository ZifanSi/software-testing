package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class FuzzTest {

    // An empty list, expecting an IllegalArgumentException.
    @Test
    public void emptyList() {
        List<Integer> numbers = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> MinElement.min(numbers));
    }

    // A null list, expecting a NullPointerException.
    @Test
    public void nullList() {
        assertThrows(NullPointerException.class, () -> MinElement.min(null));
    }

    // A list containing null values, expecting a NullPointerException.
    @Test
    public void listWithNullValues() {
        List<Integer> numbers = Arrays.asList(1, null, 3);
        assertThrows(NullPointerException.class, () -> MinElement.min(numbers));
    }

    // A large dataset to check performance.
    @Test
    public void largeDataset() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1000000; i > 0; i--) {
            numbers.add(i);
        }
        assertEquals((Integer) 1, MinElement.min(numbers));
    }

    // Extreme integer values.
    @Test
    public void extremeIntegerValues() {
        List<Integer> numbers = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        assertEquals((Integer) Integer.MIN_VALUE, MinElement.min(numbers));
    }

    // Extreme float values.
    @Test
    public void extremeFloatValues() {
        List<Float> numbers = Arrays.asList(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, 0.0f);
        assertEquals((Float) Float.NEGATIVE_INFINITY, MinElement.min(numbers));
    }

    // A list containing very long strings.
    @Test
    public void veryLongStrings() {
        String longString1 = "a".repeat(100000);
        String longString2 = "b".repeat(100000);
        List<String> words = Arrays.asList(longString1, longString2);
        assertEquals(longString1, MinElement.min(words));
    }

    // Randomly generated numbers.
    @Test
    public void randomNumbers() {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(rand.nextInt());
        }
        Integer expectedMin = Collections.min(numbers); // Using Java's built-in method for expected value.
        assertEquals(expectedMin, MinElement.min(numbers));
    }
}
