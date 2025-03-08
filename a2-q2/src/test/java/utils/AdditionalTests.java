package utils;

import org.junit.Test;
import static org.junit.Assert.assertThrows;

import java.util.Arrays;
import java.util.List;

public class AdditionalTests {

    /**
     * Test where the first element in the list is null.
     * This specifically covers the explicit check:
     *   if (result == null) throw new NullPointerException("Min.min");
     */
    @Test
    public void firstElementNull() {
        List<Integer> numbers = Arrays.asList(null, 5, 10);
        assertThrows(NullPointerException.class, () -> MinElement.min(numbers));
    }

    /**
     * Test where the list contains elements that are not mutually comparable.
     * This should trigger a ClassCastException when calling compareTo().
     */
    @Test
    @SuppressWarnings({"rawtypes", "unchecked"})  // Suppress raw-type warnings for demonstration
    public void classCastExceptionTest() {
        // Mixed raw types to cause a ClassCastException during compareTo.
        List list = Arrays.asList("stringValue", 42);
        assertThrows(ClassCastException.class, () -> MinElement.min(list));
    }
}
