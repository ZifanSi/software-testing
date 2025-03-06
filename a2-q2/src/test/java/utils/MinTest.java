package utils;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinTest {

    /**
     * Test Case 1: Finding the minimum element in a list of distinct integers.
     */
    @Test
    public void testMinIntegerList() {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        assertEquals(Integer.valueOf(1), MinElement.min(numbers));
    }

    /**
     * Test Case 2: Finding the minimum in a sorted increasing list.
     */
    @Test
    public void testMinSortedList() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        assertEquals(Integer.valueOf(10), MinElement.min(numbers));
    }

    /**
     * Test Case 3: Finding the minimum in a list containing negative numbers.
     */
    @Test
    public void testMinNegativeNumbers() {
        List<Integer> numbers = Arrays.asList(-5, -10, 0, -3);
        assertEquals(Integer.valueOf(-10), MinElement.min(numbers));
    }

    /**
     * Test Case 4: Finding the minimum in a list with mixed large numbers.
     */
    @Test
    public void testMinLargeNumbers() {
        List<Integer> numbers = Arrays.asList(100, 50, 25, 75, 10);
        assertEquals(Integer.valueOf(10), MinElement.min(numbers));
    }

    /**
     * Test Case 5: Finding the minimum in a list where all elements are the same.
     */
    @Test
    public void testMinAllSameNumbers() {
        List<Integer> numbers = Arrays.asList(7, 7, 7, 7, 7);
        assertEquals(Integer.valueOf(7), MinElement.min(numbers));
    }

    /**
     * Test Case 6: Finding the minimum in a single-element list.
     */
    @Test
    public void testMinSingleElement() {
        List<Integer> numbers = Arrays.asList(1);
        assertEquals(Integer.valueOf(1), MinElement.min(numbers));
    }
}
