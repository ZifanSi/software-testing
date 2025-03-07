package utils;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerTest {

    // Test min() with a list of positive integers.
    @Test
    public void positiveInteger() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 5);
        assertEquals((Integer) (5), MinElement.min(numbers));
    }

    // Test min() with a list of negative integers.
    @Test
    public void negativeInteger() {
        List<Integer> numbers = Arrays.asList(-10, -20, -30, -5);
        assertEquals((Integer) (-30), MinElement.min(numbers));
    }

    // Test min() with a list of mixed integers.
    @Test
    public void mixedInteger() {
        List<Integer> numbers = Arrays.asList(5, -1, 3, -10, 8);
        assertEquals((Integer) (-10), MinElement.min(numbers));
    }

    // Test min() with a list of duplicate integers.
    @Test
    public void duplicateInteger() {
        List<Integer> numbers = Arrays.asList(4, 4, 4, 4, 4);
        assertEquals((Integer) 4, MinElement.min(numbers));
    }

    // Test min() with a single-element list.
    @Test
    public void singleInteger() {
        List<Integer> numbers = Arrays.asList(42);
        assertEquals((Integer) 42, MinElement.min(numbers));
    }
}