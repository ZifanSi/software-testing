package calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    } // ✅ Closing bracket added here

    @Test
    public void testDivideNegativeNumbers() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, -2);
        assertEquals(-5.0, result, 0.0001);
    }
}
