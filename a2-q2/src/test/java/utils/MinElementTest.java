package utils;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;

public class MinElementTest {

    /**
     * ✅ Test Case 1A: Covers `if (list.size() == 0) == FALSE`
     * Ensures that `MinElement.min()` works when the list is NOT empty.
     */
    @Test
    public void testMinIntegerList() {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3); // Non-empty list
        assertEquals(Integer.valueOf(1), MinElement.min(numbers)); // Should return 1
    }

    /**
     * ✅ Test Case 1B: Covers `if (list.size() == 0) == TRUE`
     * Ensures that `MinElement.min()` throws an exception when the list is empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyList() {
        List<Integer> emptyList = new ArrayList<>(); // Empty list
        MinElement.min(emptyList); // Should throw IllegalArgumentException
    }
}
